/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Bien;

/**
 *
 * @author Usuario
 */
public class Policia {

    private int mayorDeEdad = 18;
    
    public Policia() {
    }
    
    public boolean esMayorDeEdad(Persona persona){
        if(persona.getEdad()>=mayorDeEdad){
            return true;
        }
        return false;
    }
    public boolean puedeComprarCigarrillos(Persona persona){
        return esMayorDeEdad(persona);
    }
    
    public boolean puedeComprarLicor(Persona persona){
        return esMayorDeEdad(persona);
    }
    
    public boolean puedeEntrarADisco(Persona persona){
        return esMayorDeEdad(persona);
    }
    
}
