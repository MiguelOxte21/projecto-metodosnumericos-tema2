/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2metodosnumericos;

import java.util.ArrayList;

/**
 *
 * @author cbo_m
 */
public class ctrlMetodos2 {
    public tblPunto Punto(double li,double errordeseado,int iteraciones){
        ArrayList<csPunto> lista =  null;
        tblPunto tabla = null;
        double gx;
        double error=1;
        int iteracion = 0;
        gx=getfx(li);
        while (error>errordeseado){
            csPunto fila=new csPunto();
            fila.setIteracion(iteracion+1);
            fila.setXi(li);
            fila.setGx(this.getfx(fila.getXi()));
            fila.setError(this.errorRelativo(fila.getGx(), fila.getXi()));
            li = fila.getXi();
            error = this.errorRelativo(fila.getGx(), fila.getXi());
            /*fila.setError(this.erorrRelativo(fila.getGx(), fila.getXi()));
            error = this.erorrRelativo(fila.getGx(), fila.getXi());
            li=fila.getXi();
            tabla=new tblPunto(lista);
            lista.add(fila);
            //fila.toString();
            //return tabla;*/
        }
        tabla = new tblPunto(lista);
        return tabla;
    }
    private double getfx(double x){        
        return Math.exp(-x);
    }
    private double errorRelativo(double xfinal, double xprincipio){
        return Math.abs((xfinal-xprincipio)/xfinal);
    }
}
