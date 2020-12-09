/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.problema1.Problema2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Tester {

    public static void main(String[] args) {
        //CONFIGURAR MONEDAS
        Moneda mColon = new Moneda("Colon", 1);
        Moneda m2 = new Moneda();
        Moneda m3 = new Moneda();
        int numMonedaOrigen;
        int numMonedaSalida;
        String monedaM2, monedaM3;
        float valorM2, valorM3;

        //INICIA 
        Scanner s = new Scanner(System.in);
        MaqConvertidora maq = new MaqConvertidora(mColon, m2, m3);
        //maq.setMonedaColon(mColon);
        //maq.setMonedaDolar(mDolar);
        //maq.setMonedaEuro(mEuro);

        while (true) {
            //ingresar valores durante la ejecucion del programana 
            System.out.println("Digite el nombre de la meneda ");
            monedaM2 = s.next();
            System.out.println("Digite el valor de la meneda respecto al colon");
            valorM2 = s.nextFloat();
            System.out.println("Digite el nombre de la otra meneda");
            monedaM3 = s.next();
            System.out.println("Digite el valor de la otra meneda respecto al colon");
            valorM3 = s.nextFloat();
            //asignar valor digitado por el usuario a los objetos
            m2.setNombre(monedaM2);
            m2.setValorColon(valorM2);
            //obj3
            m3.setNombre(monedaM3);
            m3.setValorColon(valorM3);

            do {
                System.out.println("Digite la moneda de origen 1=Colon 2=" + m2.getNombre()+ " 3=" + m3.getNombre());
                numMonedaOrigen = s.nextInt();
                
            } while (numMonedaOrigen <= 0 || numMonedaOrigen >= 4);

            do {
                System.out.println("Digite la moneda de salida 1=Colon 1=Colon 2=" + m2.getNombre()+ " 3=" + m3.getNombre());
                numMonedaSalida = s.nextInt();
            } while (numMonedaSalida <= 0 || numMonedaSalida >= 4);

            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();

            if (numMonedaOrigen == 1) {//Colon
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mColon, cantidad, monedaM2, monedaM3) + " Colones");
                } else if (numMonedaSalida == 2) { //m2
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, m2, cantidad, monedaM2, monedaM3) + m2.getNombre());
                } else { //m3
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, m3, cantidad, monedaM2, monedaM3) + m3.getNombre());
                }
            } else if (numMonedaOrigen == 2) {//m2
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(m2, mColon, cantidad, monedaM2, monedaM3) + " Colones");
                } else if (numMonedaSalida == 2) { //m2
                    System.out.println("El valor equivalente es: " + maq.convertir(m2, m2, cantidad, monedaM2, monedaM3) +  m2.getNombre());
                } else { //m3
                    System.out.println("El valor equivalente es: " + maq.convertir(m2, m3, cantidad, monedaM2, monedaM3)+ m3.getNombre());
                }
            } else if (numMonedaOrigen == 3) {//m3
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(m3, mColon, cantidad, monedaM2, monedaM3) + " Colones");
                } else if (numMonedaSalida == 2) { //m2
                    System.out.println("El valor equivalente es: " + maq.convertir(m3, m2, cantidad, monedaM2, monedaM3) +  m2.getNombre());
                } else { //m3
                    System.out.println("El valor equivalente es: " + maq.convertir(m3, m3, cantidad, monedaM2, monedaM3) + m3.getNombre());
                }
            }

        }
    }
}
