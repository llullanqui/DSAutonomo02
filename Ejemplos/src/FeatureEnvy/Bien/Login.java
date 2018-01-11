/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Bien;

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
    
    public void ingresar(String usuario,String contrasena){
        if(buscarCoincidencia(usuarios, usuario) && buscarCoincidencia(contrasenas, contrasena)){
            System.out.println("Se ingreso al sistema");
        }else{
            System.out.println("No se pudo ingresar al sistema");
        }
    }
    
    public boolean buscarCoincidencia(List<String> lista, String palabra){
        for(String i : lista){
            if(i.equals(palabra)){
                return true;
            } 
        }
        return false;
    }
}
