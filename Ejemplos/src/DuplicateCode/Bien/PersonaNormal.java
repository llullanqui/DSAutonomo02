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
public class PersonaNormal extends Persona {

    private String cedula;

    public PersonaNormal(String nombre, double dinero, String cedula) {
        super(nombre, dinero);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
