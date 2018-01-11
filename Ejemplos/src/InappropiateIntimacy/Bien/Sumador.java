/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Bien;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Sumador {

    public Sumador() {
    }
    
    public double sumarIngresos(List<Tienda> tiendas){
        double suma = 0;
        for(Tienda tienda : tiendas){
            suma+=tienda.getIngresoDelMes();
        }
        return suma;
    }
}
