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
public class Telefono {

    private String codigoProvincia;
    private String numero;

    public Telefono() {
    }

    public Telefono(String codigoProvincia, String numero) {
        this.codigoProvincia = codigoProvincia;
        this.numero = numero;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
