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
public class Problema6 {

    public static void main(String[] args) {
        boolean continuar = true;
        do {

            int opcion;
            //do while para elegir opcion del meny
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la operacion que desea realizar: " + "\n"
                        + "1 para cuadrado" + "\n"
                        + "2 para rectangulo" + "\n"
                        + "3 para circulo" + "\n"
                ));
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado"));
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + areaCuadrado(lado));
                    break;
                case 2:
                    int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del largo"));
                    int ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del ancho"));
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + areaRectangulo(largo, ancho));
                    break;
                case 3:
                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio"));
                    JOptionPane.showMessageDialog(null, "El area del circulo es: " + areaCirculo(radio));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");

            }
            
            int opcionContinuar = JOptionPane.showConfirmDialog(null, "Desea continuar", "yesNo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (opcionContinuar == 1) {
                continuar = false;
                }
            
        } while (continuar);
        
        JOptionPane.showMessageDialog(null, "Gracias por su tiempo!");

    }

    public static int areaCuadrado(int lado) {
        return lado * lado; //retorna el area del cuadrado
    }

    public static int areaRectangulo(int largo, int ancho) {
        return largo * ancho;//retorna el area del rectangulo
    }

    public static double areaCirculo(int radio) {
        double pi = Math.PI;
        return pi * Math.pow(radio, 2); //retorna el area del circulo
    }

}
