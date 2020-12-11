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

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cant = 2;
        int[] vecto1 = new int[cant];
        int[] vecto2 = new int[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Primer vector, Ingrese un numero entero");
            vecto1[i] = s.nextInt();
        }

        for (int i = 0; i < cant; i++) {
            System.out.println("Segundo vector, Ingrese un numero entero");
            vecto2[i] = s.nextInt();
        }

        Arrays.sort(vecto1);
        Arrays.sort(vecto2);

        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(ordenarArreglo(vecto1, vecto2, cant)));
    }

    public static int[] ordenarArreglo(int[] vector1, int[] vector2, int cant) {
        int valor = 0;
        int[] vectorFinal = new int[cant + cant];
        int pos = 0;

//        for(int i=0; i<=vectorFinal.length; i++){
//            
//            if
//        }
        for (int x : vector1) //copying elements of secondArray using for-each loop  
        {
            vectorFinal[pos] = x;
            pos++;              //increases position by 1  
        }
        for (int x : vector2) //copying elements of firstArray using for-each loop  
        {
            vectorFinal[pos] = x;
            pos++;
        }

        return vectorFinal;
    }

}
