/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Bien;

/**
 *
 * @author Usuario
 */
public class CalculadorDeDiasVividos {
    
    private int edad;

    public CalculadorDeDiasVividos(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int diasVividos(){
        return this.edad * 360;
    }
    
}
