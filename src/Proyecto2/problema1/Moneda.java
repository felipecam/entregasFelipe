/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.problema1;

/**
 *
 * @author fbriceno
 */
public class Moneda {
    
    private String moneda;
    private double valor;

    public Moneda() {
    }
    
    public Moneda(String moneda, double valor) {
        this.moneda = moneda;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
    
}
