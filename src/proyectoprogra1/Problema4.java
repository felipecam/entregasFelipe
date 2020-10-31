/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import sun.util.calendar.Gregorian;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author fbriceno
 */
public class Problema4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //se instancia un objeto de la clase GregorianCalendar la cual cuenta con un metodo que ya calcula si un año es bisiesto o no, me parecio super interesante
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Ingrese el año que desea validar si es bisiesto");
        int anio = entrada.nextInt();
        if (calendar.isLeapYear(anio)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        
        //Utilizando la formula para calcula si el año es bisiesto o no:
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

    }

}
