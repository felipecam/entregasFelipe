/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fbriceno
 */
public class Main {

    static Scanner s = new Scanner(System.in);
    static int cant = 3;
    static int[] vecto1 = new int[cant];
    static int[] vecto2 = new int[cant];

    public static void main(String[] args) {

        llenarArreglo1();
        llenarArreglo2();

        Arrays.sort(vecto1);
        Arrays.sort(vecto2);
        

        System.out.println("Vector final: " + "\n"  + Arrays.toString(ordenarArreglo(vecto1, vecto2, (cant + cant))));
    }

    public static void llenarArreglo1() {
        for (int i = 0; i < cant; i++) {
            System.out.println("Primer vector, Ingrese un numero entero");
            vecto1[i] = s.nextInt();
        }
    }

    public static void llenarArreglo2() {
        for (int i = 0; i < cant; i++) {
            System.out.println("Segundo vector, Ingrese un numero entero");
            vecto2[i] = s.nextInt();
        }
    }

    public static int[] ordenarArreglo(int[] vector1, int[] vector2, int cant) {
        int valor = 0;
        int[] vectorFinal = new int[cant];
        int i = 0;
        int pos = 0;

        for (int x : vectorFinal) //ciclo for each:
        {
            if (i % 2 == 0) {
                vectorFinal[i] = vector1[pos];
                i++;
            } else {
                vectorFinal[i] = vector2[pos];
                i++;
                pos++;
            }
        }

        return vectorFinal;
    }

}
