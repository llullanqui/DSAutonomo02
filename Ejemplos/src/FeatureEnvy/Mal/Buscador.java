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
public class Buscador {

    public Buscador() {
    }
    
    public boolean buscarCoincidenciaString(List<String> lista, String palabra){
        for(String i : lista){
            if(i.equals(palabra)){
                return true;
            } 
        }
        return false;
    }
    
}
