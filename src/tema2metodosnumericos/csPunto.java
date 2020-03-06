/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2metodosnumericos;

/**
 *
 * @author cbo_m
 */
public class csPunto {
    private int iteracion;
    private double xi, gx, error;

    @Override
    public String toString() {
        System.out.println("Iteracion: "+iteracion+"Xi: "+xi+"gx: "+gx+"Erro: "+error);
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getGx() {
        return gx;
    }

    public void setGx(double gx) {
        this.gx = gx;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
    
}
