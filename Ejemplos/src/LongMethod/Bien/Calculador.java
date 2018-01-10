/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Bien;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculador {
    
    public Calculador(){
        
    }
    
    public double calcularTotalDeFacturaMasIva(double suma,double iva){
        return suma*iva; //Tomando en cuenta que si el iva es del 12% entonces deberia ser puesto en el parametro como 1.12
    }
    
    public double sumaValoresFactura(List<Double> valores){
        double total = 0;
        for(double valor : valores){
            total += valor;
        }
        return total;
    }
}
