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
public class csBiseccion {
    private int iteracion;
    private double xi, xs, xr, fxi, fxr, produccto, error;

    @Override
    public String toString() {
        System.out.println("fxi"+fxi+"fxr"+fxr+"Producto: "+produccto+"Interacions: "+iteracion+"+xi: "+xi+"xs: "+xs+"xr: "+xr+"Error: "+error+"\n");
        return super.toString();
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

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxr() {
        return fxr;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
    }

    public double getProduccto() {
        return produccto;
    }

    public void setProduccto(double produccto) {
        this.produccto = produccto;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
    
}
