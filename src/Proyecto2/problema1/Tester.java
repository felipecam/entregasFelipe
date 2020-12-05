/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.problema1;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Tester {

    public static void main(String[] args) {
        //CONFIGURAR MONEDAS
        Moneda mColon = new Moneda("Colon", 1);
        Moneda mDolar = new Moneda("Dolar", 500);
        Moneda mEuro = new Moneda("Euro", 765);
        int numMonedaOrigen;
        int numMonedaSalida;

        //INICIA 
        Scanner s = new Scanner(System.in);
        MaqConvertidora maq = new MaqConvertidora(mColon, mDolar, mEuro);
        //maq.setMonedaColon(mColon);
        //maq.setMonedaDolar(mDolar);
        //maq.setMonedaEuro(mEuro);

        while (true) {
            do {
                System.out.println("Digite la moneda de origen 1=Colon 2=Dolar 3=Euro");
                numMonedaOrigen = s.nextInt();
            } while (numMonedaOrigen <= 0 || numMonedaOrigen >= 4);

            do {
                System.out.println("Digite la moneda de salida 1=Colon 2=Dolar 3=Euro");
                numMonedaSalida = s.nextInt();
            } while (numMonedaSalida <= 0 || numMonedaSalida >= 4);
            
            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();

            if (numMonedaOrigen == 1) {//Colon
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mColon, cantidad) + " Colones");
                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mDolar, cantidad) + " Dolares ");
                } else { //euro
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mEuro, cantidad) + " Euros");
                }
            } else if (numMonedaOrigen == 2) {//Dolar
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mColon, cantidad) + " Colones");
                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mDolar, cantidad) + " Dolares ");
                } else { //euro
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mEuro, cantidad) + " Euros");
                }
            } else if (numMonedaOrigen == 3) {//Dolar
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mColon, cantidad) + " Colones");
                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mDolar, cantidad) + " Dolares ");
                } else { //euro
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mEuro, cantidad) + " Euros");
                }
            }
        }
    }
}
