/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Mal;

/**
 *
 * @author Usuario
 */
public class Gritador {

    public Gritador() {
    }
    
    public void gritar(Militar militar){
        if(militar instanceof Teniente){
            System.out.println("YO SOY UN TENIENTE");
        }else if(militar instanceof Soldado){
            System.out.println("YO SOY UN SOLDADO");
        }else if(militar instanceof Capitan){
            System.out.println("YO SOY UN CAPITAN");
        }else if(militar instanceof Mayor){
            System.out.println("YO SOY UN MAYOR");
        }else if(militar instanceof General){
            System.out.println("YO SOY UN SOLDADO");
        }
    }
}
