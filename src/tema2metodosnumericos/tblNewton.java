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
public class tblNewton extends AbstractTableModel{
    private String[] columnas = {"I", "XI", "FXI", "FXR", "DIVISION", "ERROR"};
    private ArrayList <csNewton> lista = null;

    public tblNewton(ArrayList<csNewton> resultados) {
        this.lista=resultados;
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
        csNewton fila = this.lista.get(i);
        switch(columna){
            case 0: return fila.getIteracion();
            case 1: return fila.getXi();
            case 2: return fila.getFxi();
            case 3: return fila.getFxr();
            case 4: return fila.getDivision();
            case 5: return fila.getError();
        }
        return null;
    }
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
