/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Mal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculador {
    
    public Calculador(){
        
    }
    
    public void calcularTotalDeFacturaMasIva(){
        System.out.println("Ingrese los datos que se le piden a continuación");
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        double total = 0;
        while(seguir){
            System.out.print("Ingrese el valor del producto: ");
            double val = sc.nextDouble();
            System.out.print("¿Desea seguir ingresando valores? (si/no)");
            String respuesta = sc.nextLine();
            if(respuesta.equals("no")){
                seguir = false;
            }
        }
        double totalConIva = total*1.12;
        System.out.println("El total más iva es de: " + totalConIva);
    }
}
