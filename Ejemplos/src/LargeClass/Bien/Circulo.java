/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.Bien;

/**
 *
 * @author Usuario
 */
public class Circulo implements Figura{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public void Area(){
        double area = Math.pow(radio, 2) * Math.PI;
        System.out.println(area);
    }
}
