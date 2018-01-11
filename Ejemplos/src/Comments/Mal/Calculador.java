/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Mal;

/**
 *
 * @author Usuario
 */

//Clase para calcular la cantidad de dias vividos
public class Calculador {
    
    private int edad; //Edad de la perosna
    
    //Constructor de la clase
    public Calculador(int valor){ //Se recibe como parametro la edad 
        this.edad = valor; //Seteando la edad en la clase
    }
    
    //Metodo para retornar la edad guardada en la clase
    public int Edad1() { //No se recibe parametros
        return edad;// Retornando la edad guardada en la clase
    }

    //Metodo para setear la edad en la clase
    public void Edad2(int valor) { // Se recibe como parametro la edad
        this.edad = valor; // Se guarda la edad en la clase
    }
    
    //Metodo para calcular los dias vividos
    public void calcular(){ //No se recibe parametros
        int dias = edad * 360; //Se multiplica la edad por la cantidad de dias del anio
        System.out.println("Dias vividos: " + dias); //Se imprime por pantalla los dias vivdos
    }
    
}
