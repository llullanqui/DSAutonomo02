/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Bien;

/**
 *
 * @author Usuario
 */
public class Direccion {

    private String ciudad;
    private String calle;
    private String barrio;
    private String manzana;
    private String villa;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, String barrio, String manzana, String villa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.barrio = barrio;
        this.manzana = manzana;
        this.villa = villa;
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
