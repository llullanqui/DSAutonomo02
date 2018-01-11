/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Bien;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Datos {
    
    private int edadMinimaDeRegistro = 18;
    private String nombreUniversidad = "Espol";
    private LinkedList<String> nombresEstudiantes = new LinkedList();
    private int edadUniversidad = 152;

    public int getEdadMinimaDeRegistro() {
        return edadMinimaDeRegistro;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public List<String> getNombresEstudiantes() {
        return Collections.unmodifiableList(nombresEstudiantes);
    }
    
    public void anadirEstudiante(String nombre){
        nombresEstudiantes.add(nombre);
    }

    public void quitarEstudiante(String nombre){
        nombresEstudiantes.removeFirstOccurrence(nombre);
    }
    
    public int getEdadUniversidad() {
        return edadUniversidad;
    }
        
}
