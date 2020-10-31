/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.Scanner;

/**
 *
 * @author fbriceno
 */
public class Problema5 {

    public static void main(String[] args) {

        int j = 0;
        float pi = 0;
        for (float i = 1; i <= 101; i += 2) {

            if (i == 1 || j == 4) { //la suma sucede cada cuatro numeros
                pi = pi + (4 / i);
                j = 2; //en la siguiente iteracion se irial al else aplicando la resta
            } else {

                pi = pi - (4 / i);
                j = j + 2; // por ello se hace uso de esta condicion, en la siguiente iteracion del ciclo j seria 4
            }
        }
        System.out.println("El valor de pi es: " + pi);
    }
}
