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
public class ctrlMetodos {

    public tblBiseccion Biseccion(double li, double ls, double errordeseado, int iteraciones) {
        ArrayList<csBiseccion> lista =  null;// = new ArrayList<csBiseccion>();
        tblBiseccion tabla = null;
        double fxi;
        double fxs;
        double errorcalculado=1;
        int iteracion = 0;
        double xanterior;
        fxi = this.getfx(li);
        fxs = this.getfx(ls);
        
        if((fxi*fxs)<0){
            lista = new ArrayList<csBiseccion>();
            while(errorcalculado>errordeseado && iteraciones>0){
                csBiseccion fila = new csBiseccion();
                fila.setIteracion(iteracion+1);
                fila.setXi(li);
                fila.setXs(ls);
                fila.setXr((fila.getXi()+fila.getXs())/2);
                fila.setFxi(this.getfx(fila.getXi()));
                fila.setFxr(this.getfx(fila.getXr()));
                fila.setProduccto(fila.getFxi()*fila.getFxr());
                
                if(fila.getProduccto()>0){
                    errorcalculado = this.erorrRelativo(li, ls);
                    xanterior = li;
                    li = fila.getXr();                    
                }else{
                    errorcalculado = this.erorrRelativo(li, ls);
                    xanterior = ls;
                    ls = fila.getXr();
                }
                //errorcalculado = this.erorrRelativo(fila.getXr(), xanterior);
                fila.setError(errorcalculado);
                fila.toString();
                lista.add(fila);
                iteracion++;
            }
            tabla = new tblBiseccion(lista);
            return tabla;
        }else{
            return null;
        }
    }
    private double getfx(double x){
        
        return ((9.8*68.1)/x)*(1-Math.exp(-(x/68.1)*10))-40;
    }
    private double erorrRelativo(double xactual, double xanterior){
        return Math.abs((xactual-xanterior)/xactual);
    }
}
