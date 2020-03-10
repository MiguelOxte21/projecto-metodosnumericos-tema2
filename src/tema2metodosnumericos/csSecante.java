/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2metodosnumericos;

/**
 *
 * @author Dell
 */
public class csSecante {
    int iteraciones;
    double xs,xi,fxs,fxi,n,d,division,errorcalculado;

    @Override
    public String toString() {
        System.out.println("iteracion: "+ iteraciones+" xs: "+xs+" xi: "+xi+" FXS: "+fxs+" FXI: "+fxi+""
                + " N: "+n+" D: "+d+" division: "+division+" error: "+errorcalculado+"\n");
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getFxs() {
        return fxs;
    }

    public void setFxs(double fxs) {
        this.fxs = fxs;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getErrorcalculado() {
        return errorcalculado;
    }

    public void setErrorcalculado(double errorcalculado) {
        this.errorcalculado = errorcalculado;
    }
    
}
