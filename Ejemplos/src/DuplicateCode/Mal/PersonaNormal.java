/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Mal;

/**
 *
 * @author Usuario
 */
public class PersonaNormal {
    private String nombre;
    private double dinero;
    private String cedula;

    public PersonaNormal(String nombre, double dinero, String cedula) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cedula = cedula;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void aumentarDinero(double cantidad){
        this.dinero += cantidad;
    }
    
    public void quitarDinero(double cantidad){
        this.dinero -= cantidad;
    }
}
