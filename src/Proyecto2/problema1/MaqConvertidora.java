/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.problema1;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class MaqConvertidora {

    Moneda monedaColon;
    Moneda monedaDolar;
    Moneda monedaEuro;

    public MaqConvertidora() {
    }

    public MaqConvertidora(Moneda monedaColon, Moneda monedaDolar, Moneda monedaEuro) {
        this.monedaColon = monedaColon;
        this.monedaDolar = monedaDolar;
        this.monedaEuro = monedaEuro;
    }

    //Este metodo requiere que monedaOrigen y monedaSalida esten establecidas
    public float convertir(Moneda monedaOrigen, Moneda monedaSalida, float cantidadOrigen) {
        float resultado = 0;
        if (monedaOrigen != null && monedaSalida != null) {

            if (monedaOrigen.getNombre().equals("Colon")) { //Colon moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen;
                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen / monedaDolar.getValorColon();
                } else {
                    resultado = cantidadOrigen / monedaEuro.getValorColon();
                }
            } else if (monedaOrigen.getNombre().equals("Dolar")) { //DOLAR moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen* monedaDolar.getValorColon();
                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen;
                } else {
                    resultado = (cantidadOrigen * monedaDolar.getValorColon()) / monedaEuro.getValorColon();
                }
            }else if (monedaOrigen.getNombre().equals("Euro")) { //EURO moneda origen
                if (monedaSalida.getNombre().equals("Colon")) {
                    resultado = cantidadOrigen* monedaEuro.getValorColon();
                } else if (monedaSalida.getNombre().equals("Dolar")) {
                    resultado = cantidadOrigen*(monedaEuro.getValorColon()/monedaDolar.getValorColon());
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

    public Moneda getMonedaDolar() {
        return monedaDolar;
    }

    public void setMonedaDolar(Moneda monedaDolar) {
        this.monedaDolar = monedaDolar;
    }

    public Moneda getMonedaEuro() {
        return monedaEuro;
    }

    public void setMonedaEuro(Moneda monedaEuro) {
        this.monedaEuro = monedaEuro;
    }

}
