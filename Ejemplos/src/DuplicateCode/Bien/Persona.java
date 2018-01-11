/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Bien;

/**
 *
 * @author Usuario
 */
public class Persona {

    protected String nombre;
    protected double dinero;

    public Persona(String nombre, double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void aumentarDinero(double cantidad) {
        this.dinero += cantidad;
    }

    public void quitarDinero(double cantidad) {
        this.dinero -= cantidad;
    }

}
