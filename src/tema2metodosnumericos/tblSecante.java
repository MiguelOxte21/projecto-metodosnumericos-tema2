/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2metodosnumericos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dell
 */
public class tblSecante extends AbstractTableModel{
    private String[] columnas = {"Iteracion", "Xi-i", "Xi", "FXi-i", "Fxi", "NUM", "DEN", "X+i","Error"};
    private ArrayList <csSecante> lista = null;
    public tblSecante(ArrayList<csSecante> resultados){
    this.lista = resultados;
}

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int columna) {
        csSecante fila=this.lista.get(i);
        switch(columna){
            case 0: return fila.getIteraciones();
            
            case 1: return fila.getXs();
            
            case 2: return fila.getXi();
            
            case 3: return fila.getFxs();
            
            case 4: return fila.getFxi();
            
            case 5: return fila.getN();
            
            case 6: return fila.getD();
            
            case 7: return fila.getDivision();
            
            case 8:return fila.getErrorcalculado();
        }
        return null;
    }
    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
    
}
