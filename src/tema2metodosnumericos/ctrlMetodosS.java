/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2metodosnumericos;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ctrlMetodosS {
    public tblSecante Secante(double xs,double xi,double errordeseado, int iteraciones){
        ArrayList<csSecante> lista =  null;
        
        tblSecante tabla=null;
        double errorcalculado=1;
        int iteracion=0;
        lista=new ArrayList<csSecante>();
        while(errorcalculado>errordeseado && iteracion<iteraciones){
            csSecante fila=new csSecante();
        fila.setIteraciones(iteracion+1);
        fila.setXs(xs);
        fila.setXi(xi);
        fila.setFxs(this.getfxi(xs));
        fila.setFxi(this.getfxi(xi));
        fila.setN(this.getnum(fila.getFxi(), fila.getXs(), fila.getXi()));
        fila.setD(this.getdeno(fila.getFxs(),fila.getFxi()));
        fila.setDivision(fila.getXi()-(fila.getN()/fila.getD()));
        errorcalculado=this.errorcalculado(fila.getDivision(),fila.getXi());
        xs=fila.getXi();
        xi=fila.getDivision();
        fila.setErrorcalculado(errorcalculado);
        fila.toString();
        lista.add(fila);
        iteracion++;
        }
        tabla=new tblSecante(lista);
        return tabla;
    }
    double getfxi(double xi){
        return (Math.exp(-xi))-xi;
    }
    double getnum(double fxi,double xs,double xi){
        return (fxi*(xs-xi));
    }
    double getdeno(double fxs,double fxi){
        return (fxs-fxi);
    }
    double errorcalculado(double division,double xi){
        return Math.abs((division-xi)/division);
    }
}
