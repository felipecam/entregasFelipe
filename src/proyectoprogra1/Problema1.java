/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class Problema1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //test
        /*
 *PROBLEMA 1
         */
        int opcion;
        int numero1, numero2;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la operacion que desea realizar: " + "\n"
                    + "1 para suma" + "\n"
                    + "2 para resta" + "\n"
                    + "3 para multiplicacion" + "\n"
                    + "4 para division " + "\n"
            ));
        } while (opcion < 1 || opcion > 4);

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero"));

        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + (numero1 * numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + (numero1 / numero2));
                break;

            default:
                JOptionPane.showMessageDialog(null, "opcion invalida");
                break;

        }
    }
}
