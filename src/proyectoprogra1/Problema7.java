/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class Problema7 {

    public static void main(String[] args) {

        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero base"));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del exponente"));
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {

            resultado *= base; // se va acumulando el resultado en la variable resultado
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

    }
}
