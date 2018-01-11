/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Mal;

/**
 *
 * @author Usuario
 */
public class Policia {

    public Policia() {
    }
    
    public boolean puedeComprarCigarrillos(Persona persona){
        if(persona.getEdad()>=18){
            return true;
        }
        return false;
    }
    
    public boolean puedeComprarLicor(Persona persona){
        if(persona.getEdad()>=18){
            return true;
        }
        return false;
    }
    
    public boolean puedeEntrarADisco(Persona persona){
        if(persona.getEdad()>=18){
            return true;
        }
        return false;
    }
    
}
