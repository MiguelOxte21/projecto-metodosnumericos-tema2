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
    public tblPunto Punto(double li){
        ArrayList<csPunto> lista =  null;
        tblPunto tabla = null;
        double gx;
        int iteracion = 0;
        gx=getfx(li);
        /*double error=100;
        while (error>=0){
            error = gx;
        }
         */      
        
        return null;
    }
    private double getfx(double x){        
        return Math.exp(-x);
    }
    private double erorrRelativo(double xfinal, double xprincipio){
        return Math.abs((xfinal-xprincipio)/xfinal);
    }
}
