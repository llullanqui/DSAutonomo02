/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Mal;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Casa {

    private int plantas;
    private List<String> colores;
    private String ciudad;
    private String calle;
    private String barrio;
    private String manzana;
    private String villa;

    public Casa() {
    }

    public Casa(int plantas, List<String> colores, String ciudad, String calle, String barrio, String manzana, String villa) {
        this.plantas = plantas;
        this.colores = colores;
        this.ciudad = ciudad;
        this.calle = calle;
        this.barrio = barrio;
        this.manzana = manzana;
        this.villa = villa;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getVilla() {
        return villa;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

}
