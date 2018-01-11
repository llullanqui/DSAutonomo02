/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Mal;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Login {
    
    private List<String> usuarios;
    private List<String> contrasenas;
    
    public Login(){
    }

    public Login(List<String> usuarios, List<String> contrasenas) {
        this.usuarios = usuarios;
        this.contrasenas = contrasenas;
    }
    
    public void ingresar(String usuario, String contrasena){
        Buscador buscador = new Buscador();
        if(buscador.buscarCoincidenciaString(usuarios, usuario) && buscador.buscarCoincidenciaString(contrasenas, contrasena)){
            System.out.println("Se ha ingresado al sistema");
        }else{
            System.out.println("Uno de los campos ingresados esta incorrecto");
        }
    }  
    
}
