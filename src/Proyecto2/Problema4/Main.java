/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema4;

import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author fbriceno
 */
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cantNumeros;
        int numeroEncontrar;
        boolean resultado;
        System.out.println("Ingrese la cantidad de numeros del arreglo");
        cantNumeros = s.nextInt();

        int[] numerosArrelo = new int[cantNumeros];

        for (int i = 0; i < cantNumeros; i++) {
            System.out.println("Ingrese un numero entero");
            numerosArrelo[i] = s.nextInt();
        }

        while (true) {
            System.out.println("ingrese el numero que desea encontrar");
            numeroEncontrar = s.nextInt();

            Arrays.sort(numerosArrelo); //java nos permite aprovechar los metos ya existentes para ordenar un arreglo

            if (Arrays.binarySearch(numerosArrelo, numeroEncontrar) > 0) { // si el valor esta entonces se retorna el indice como numero entero, por ello se valida si es mayor a 0.
                System.out.println(numeroEncontrar + " si esta disponible");
            } else {
                System.out.println(numeroEncontrar + " no esta disponible"); //si no esta el metodo retorna el numero negativo
            }
            
            System.out.println("Lista de numeros ingresados");
            for (int i = 0; i < cantNumeros; i++) {
                System.out.print(numerosArrelo[i] + "  ");
            }
            System.out.println();

            System.out.println("Seguir agregando si/no");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("no")) {
                break; 
            }
        }
    }
}
