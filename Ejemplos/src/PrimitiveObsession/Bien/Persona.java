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
public class Persona {
    private String identificacion;
    private String nombres;
    private Direccion direccion;
    private Telefono telefono;

    public Persona() {
    }

    public Persona(String identificacion, String nombres, Direccion direccion, Telefono telefono) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
    
}
