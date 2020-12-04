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
public class main {

    public static void main(String[] args) {

        double dolar = 500;
        double euro = dolar * 1.53;
        int monedaOrigen=0;
        int cant;

        Moneda objeroDolar = new Moneda("dolar", dolar);
        Moneda objetoEuro = new Moneda("euro", euro);

        monedaOrigen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la moneda origen: " + "\n"
                + "1: dolar" + "\n"
                + "2: euro"));

        String monedaSalida = JOptionPane.showInputDialog("Ingrese la moneda origen: " + "\n"
                + "1: dolar" + "\n"
                + "2: euro");
        
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida deseada a convertir"));

            
        if(monedaOrigen==1){
                
    }
        

    }
}
