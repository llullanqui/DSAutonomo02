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
public class PersonaJuridica {
    private String nombre;
    private double dinero;
    private String RUC;

    public PersonaJuridica(String nombre, double dinero, String RUC) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.RUC = RUC;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDineroAMano() {
        return dinero;
    }

    public void setDineroAMano(double dineroAMano) {
        this.dinero = dineroAMano;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    public void aumentarDinero(double cantidad){
        this.dinero += cantidad;
    }
    
    public void quitarDinero(double cantidad){
        this.dinero -= cantidad;
    }
    
}
