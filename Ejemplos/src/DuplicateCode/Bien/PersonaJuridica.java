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
public class PersonaJuridica extends Persona {

    private String ruc;

    public PersonaJuridica(String nombre, double dinero, String ruc) {
        super(nombre, dinero);
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

}
