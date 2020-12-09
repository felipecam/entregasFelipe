/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.problema1.Problema2;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class MaqConvertidora {

    Moneda monedaColon;
    Moneda m2;
    Moneda m3;

    public MaqConvertidora() {
    }

    public MaqConvertidora(Moneda monedaColon, Moneda m2, Moneda m3) {
        this.monedaColon = monedaColon;
        this.m2 = m2;
        this.m3 = m3;
    }

    //Este metodo requiere que monedaOrigen y monedaSalida esten establecidas
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen, String m2, String m3) {
        float resultado = 0;
        if (monedaOrigen != null && monedaSalida != null) {

            if (monedaOrigen.getNombre().equals("Colon")) { //Colon moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen;
                } else if (monedaSalida.getNombre().equals(m2)) {
                    resultado = cantidadOrigen / this.m2.getValorColon();
                } else {
                    resultado = cantidadOrigen /  this.m3.getValorColon();
                }
            } else if (monedaOrigen.getNombre().equals(m2)) { //m2 moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen* this.m2.getValorColon();
                } else if (monedaSalida.getNombre().equals(m2)) {
                    resultado = cantidadOrigen;
                } else {
                    resultado = (cantidadOrigen * this.m2.getValorColon()) / this.m3.getValorColon();
                }
            }else if (monedaOrigen.getNombre().equals(m3)) { //m3 moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen* this.m3.getValorColon();
                } else if (monedaSalida.getNombre().equals(m2)) {
                    resultado = cantidadOrigen*(this.m3.getValorColon()/this.m2.getValorColon());
                } else {
                    resultado = cantidadOrigen;
                }
            }
        }
        return resultado;
    }

    public Moneda getMonedaColon() {
        return monedaColon;
    }

    public void setMonedaColon(Moneda monedaColon) {
        this.monedaColon = monedaColon;
    }

    public Moneda getM2() {
        return m2;
    }

    public void setM2(Moneda m2) {
        this.m2 = m2;
    }

    public Moneda getM3() {
        return m3;
    }

    public void setM3(Moneda m3) {
        this.m3 = m3;
    }
    
    

}
