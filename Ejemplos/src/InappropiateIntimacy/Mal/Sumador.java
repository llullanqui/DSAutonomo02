/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Mal;

/**
 *
 * @author Usuario
 */
public class Sumador {
    
    private SucursalA suc1;
    private SucursalB suc2;
    private SucursalC suc3;

    public Sumador(SucursalA suc1, SucursalB suc2, SucursalC suc3) {
        this.suc1 = suc1;
        this.suc2 = suc2;
        this.suc3 = suc3;
    }

    public SucursalA getSuc1() {
        return suc1;
    }

    public void setSuc1(SucursalA suc1) {
        this.suc1 = suc1;
    }

    public SucursalB getSuc2() {
        return suc2;
    }

    public void setSuc2(SucursalB suc2) {
        this.suc2 = suc2;
    }

    public SucursalC getSuc3() {
        return suc3;
    }

    public void setSuc3(SucursalC suc3) {
        this.suc3 = suc3;
    }
    
    public double sumarIngresos(){
        double suma = suc1.getIngresoDelMes() + suc2.getIngresoDelMes() + suc3.getIngresoDelMes();
        suc1.setIngresoDelMes(0);
        suc2.setIngresoDelMes(0);
        suc3.setIngresoDelMes(0);
        return suma;
    }
    
}
