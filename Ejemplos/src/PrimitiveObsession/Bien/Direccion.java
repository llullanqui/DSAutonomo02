/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession.Bien;

/**
 *
 * @author Usuario
 */
public class Direccion {
    private String barrio;
    private int manzana;
    private int villa;

    public Direccion() {
    }

    public Direccion(String barrio, int manzana, int villa) {
        this.barrio = barrio;
        this.manzana = manzana;
        this.villa = villa;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getVilla() {
        return villa;
    }

    public void setVilla(int villa) {
        this.villa = villa;
    }
    
    
}
