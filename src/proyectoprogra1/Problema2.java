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
public class Problema2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*
 *Ejericio 1
         */
        // valores fijos
        System.out.println("Ejercicio 1");

        int num1 = 2;
        int num2 = 3;;
        int num3 = 5;;
        int num4 = 7;;
        int num5 = 10;;
        int num6 = 3;;

        int SumTotal = num1 + num2 + num3 + num4 + num5 + num6;
        int promedio = SumTotal / 6;
        //operacion para obtener promedio
        System.out.println("Ejercicio 1, el promedio es: " + promedio + "\n");

        /*
 *Ejericio 2
         */
        //instancia de variables
        System.out.println("Ejercicio 2");
        int[] arreglo = new int[6];
        int sumArreglo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero");
            arreglo[i] = entrada.nextInt();
            sumArreglo += arreglo[i]; //acumulador para obtener la suma
        }
        System.out.println(sumArreglo);
        //imprimir arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("numero ingresado " + arreglo[i]);
        }
        int promedio2 = sumArreglo / 6;
        System.out.println("Ejercicio 2, el promedio es: " + promedio2 + "\n");

        /*
 *Ejericio 3
         */
        System.out.println("Ejercicio 3");
        int factorial = 1;
        for (int x = 2; x <= 5; x++) {
            factorial = factorial * x;
        }
        System.out.println("El factorial del número 5 es: " + factorial + "\n");

        /*
 *Ejericio 4
         */
        System.out.println("Ejercicio 4");

        int[] arreglo4 = new int[3];
        int sumArreglo4 = 0;
        int max = 0;
        for (int i = 0; i < arreglo4.length; i++) {
            System.out.println("Ingrese el numero");
            arreglo4[i] = entrada.nextInt();
            sumArreglo4 += arreglo4[i];
            if (max <= arreglo4[i]) {
                max = arreglo4[i];
            }
        }
        //se utiliza la variable max para verificar cual es el numero maximo
        for (int i = 0; i < arreglo4.length; i++) {
            System.out.println("numero ingresado " + arreglo4[i]);
        }
        float promedio4 = sumArreglo4 / arreglo4.length;
        System.out.println("el numero maximo es: " + max + ", el promedio es: " + promedio4 + "\n");

        /*
 *Ejericio 5
         */
        System.out.println("Ejercicio 5");
        int[] arreglo5 = new int[3];
        //ingresar valores del arreglo
        for (int i = 0; i < arreglo5.length; i++) {
            System.out.println("Ingrese el numero");
            arreglo5[i] = entrada.nextInt();
        }

        //impresion del arreglo
        for (int i = 0; i < arreglo5.length; i++) {
            System.out.println("numero ingresado " + arreglo5[i]);
        }
        //impresion inversa
        int invertido = arreglo5.length;
        System.out.println("Lista invertida");
        for (int i = 1; i < arreglo5.length + 1; i++) {

            System.out.println("numero ingresado " + arreglo5[invertido - i]);
        }
        System.out.println("");

        /*
 *Ejericio 6
         */
        System.out.println("Ejercicio 6");
        int aleatorio;
        int[] arregloRandom = new int[3];
        int[] resultadoRandom;
        //ingresar valores del arreglo
        for (int i = 0; i < arregloRandom.length; i++) {
            System.out.println("Ingrese el numero");
            arregloRandom[i] = entrada.nextInt();
        }

        System.out.println("El arreglo reordenado es: ");
        resultadoRandom = reordenarAleatorio(arregloRandom);
        for (int i = 0; i < resultadoRandom.length; i++) {
            System.out.print(resultadoRandom[i] + " ");
        }

    }//fin del Main

    //funciones para ejercicio 6
    public static int[] reordenarAleatorio(int[] numeros) {
        int[] resultado = new int[numeros.length];

        //el arreglo se inicializa con ceros
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = 0;
        }

        //asignamos aleatoriamente al arreglo resultado
        for (int i = 0; i < numeros.length; i++) {
            int pos = numeroRandom(numeros.length);
            if (resultado[pos] == 0) { //si es cero significa q posicion no ha sido asignada
                resultado[pos] = numeros[i];
            } else { //sino, la iteracion no cuenta, hay que volver a intentar
                i--;
            }
        }
        return resultado;
    }

    //funcion para generar numeros aleatorios
    public static int numeroRandom(int n) {
        int random = (int) (Math.random() * (n));
        return random;
    }

}
