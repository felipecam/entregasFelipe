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
public class Problema8 {

    public static void main(String[] args) {

        int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));
        int restante = 0;
        int totalMonedas;
        int cantMil = 0, cantQuinientos = 0, cantCien = 0, cantDiez = 0, cantCinco = 0, cantUno = 0;
        if (monto >= 1000) {
            cantMil = monto / 1000;
            restante = monto % 1000;

            if (restante >= 500) {
                cantQuinientos = restante / 500;
                restante = restante % 500;
            }
            if (restante >= 100) {
                cantCien = restante / 100;
                restante = restante % 100;
            }
            if (restante >= 10) {
                cantDiez = restante / 10;
                restante = restante % 10;
            }
            if (restante >= 5) {
                cantCinco = restante / 5;
                restante = restante % 5;
            }
            if (restante >= 1) {
                cantUno = restante / 1;
            }
        }

        //monto mayor a 500 y menor a 1000
        if (monto >= 500 & monto < 1000) {
            cantQuinientos = monto / 500;
            restante = monto % 500;

            if (restante >= 100) {
                cantCien = restante / 100;
                restante = restante % 100;
            }
            if (restante >= 10) {
                cantDiez = restante / 10;
                restante = restante % 10;
            }
            if (restante >= 5) {
                cantCinco = restante / 5;
                restante = restante % 5;
            }
            if (restante >= 1) {
                cantUno = restante / 1;
            }
        }

        //monto mayor a 100
        if (monto >= 100 & monto < 500) {
            cantCien = monto / 100;
            restante = monto % 100;

            if (restante >= 10) {
                cantDiez = restante / 10;
                restante = restante % 10;
            }
            if (restante >= 5) {
                cantCinco = restante / 5;
                restante = restante % 5;
            }
            if (restante >= 1) {
                cantUno = restante / 1;
            }
        }

        //monto mayor a 10 y menor a 100
        if (monto >= 10 & monto < 100) {
            cantDiez = monto / 10;
            restante = monto % 10;

            if (restante >= 5) {
                cantCinco = restante / 5;
                restante = restante % 5;
            }
            if (restante >= 1) {
                cantUno = restante / 1;
            }
        }

        //monto mayor a 5 y menor a 10
        if (monto >= 5 & monto < 10) {
            cantCinco = monto / 5;
            restante = monto % 5;

            if (restante >= 1) {
                cantUno = restante / 1;
            }
        }

        if (monto >= 1 & monto < 5) {
            cantUno = monto / 1;
        }

        totalMonedas = cantMil + cantQuinientos + cantCien + cantDiez + cantCinco + cantUno;
        System.out.println("Monto ingresado: " + monto);
        System.out.println("Total de monedas: " + totalMonedas);
        System.out.println("Cantidad de monedas de 1000: " + cantMil);
        System.out.println("Cantidad de monedas de 500: " + cantQuinientos);
        System.out.println("Cantidad de monedas de 100: " + cantCien);
        System.out.println("Cantidad de monedas de 10: " + cantDiez);
        System.out.println("Cantidad de monedas de 5: " + cantCinco);
        System.out.println("Cantidad de monedas de 1: " + cantUno);

    }

}
