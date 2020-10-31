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
public class Problema3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*
 *PROBLEMA 3
         */
        System.out.println("Ingrese el salario mensual");
        int salario = entrada.nextInt();
        System.out.println("Ingrese el numero de dependientes");
        int dependientes = entrada.nextInt();
        float porcentajeDependiente = 0;
        float porcentajeGravable = 0;

        switch (dependientes) {
            case 1:
                porcentajeDependiente = 100;
                break;
            case 2:
                porcentajeDependiente = 90;
                break;
            case 3:
                porcentajeDependiente = 70;
                break;
            case 4:
                porcentajeDependiente = 60;
                break;
            case 5:
                porcentajeDependiente = 40;
                break;
        }

        if (salario < 200000) {
            porcentajeGravable = 0;

        } else if (salario >= 200000 && salario <= 400000) {
            porcentajeGravable = 10;

        } else if (salario > 400000 && salario <= 600000) {
            porcentajeGravable = 15;
        } else if (salario > 600000 && salario <= 800000) {
            porcentajeGravable = 20;
        } else if (salario >= 800000) {
            porcentajeGravable = 25;
        }

        System.out.println("el total de impuesto de renta a pagar es: " + impuestoRenta(salario, porcentajeDependiente, porcentajeGravable));
    }

    public static float impuestoRenta(int salario, float porcentajeDependiente, float porcentajeGravable) {
        float iRagravable = salario * (porcentajeDependiente / 100);
        return iRagravable * (porcentajeGravable / 100);
    }
}
