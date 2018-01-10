/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Bien;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Casa {

    private int plantas;
    private List<String> colores;
    private Direccion direccion;

    public Casa() {
    }

    public Casa(int plantas, List<String> colores, Direccion direccion) {
        this.plantas = plantas;
        this.colores = colores;
        this.direccion = direccion;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public List<String> getColores() {
        return colores;
    }

    public void setColores(List<String> colores) {
        this.colores = colores;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
