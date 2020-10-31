/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import sun.util.calendar.Gregorian;
/**
 *
 * @author fbriceno
 */
public class ProyectoProgra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       //test
        /*
 *PROBLEMA 1
         */
//        int opcion;
//        int numero1, numero2;
//
//        do {
//            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la operacion que desea realizar: " + "\n"
//                    + "1 para suma" + "\n"
//                    + "2 para resta" + "\n"
//                    + "3 para multiplicacion" + "\n"
//                    + "4 para division " + "\n"
//            ));
//        } while (opcion < 1 || opcion > 4);
//
//        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero"));
//        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero"));
//
//        switch (opcion) {
//            case 1:
//                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));
//                break;
//            case 2:
//                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));
//                break;
//            case 3:
//                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + (numero1 * numero2));
//                break;
//            case 4:
//                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + (numero1 / numero2));
//                break;
//
//            default:
//                JOptionPane.showMessageDialog(null, "opcion invalida");
//                break;
//
//        }
        /*
 *PROBLEMA 2
         */
//*****************************************ejercicio 1
//        int num1=2;
//        int num2=3;;
//        int num3=5;;
//        int num4=7;;
//        int num5=10;;
//        int num6=3;;
//        
//       int SumTotal=num1+num2+num3+num4+num5+num6;
//       int promedio=SumTotal/6;
//        
////        System.out.println(promedio);
//*****************************************ejercicio 2
//        int[] arreglo = new int[6];
//        int sumArreglo = 0;
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("Ingrese el numero");
//            arreglo[i] = entrada.nextInt();
//            sumArreglo += arreglo[i];
//        }
//        System.out.println(sumArreglo);
//
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("numero ingresado " + arreglo[i]);
//        }
//        int promedio = sumArreglo / 6;
//        System.out.println(promedio);
//*****************************************ejercicio 3
//        int factorial = 1;
//        for (int x = 2; x <= 5; x++) {
//            factorial = factorial * x;
//        }
//        
//        System.out.println("El factorial del número " + Integer.toString(5) +  " es " + Integer.toString(factorial));
//*****************************************ejercicio 4
//        int[] arreglo = new int[3];
//        int sumArreglo = 0;
//        int max=0;
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("Ingrese el numero");
//            arreglo[i] = entrada.nextInt();
//            sumArreglo += arreglo[i];
//            if(max<=arreglo[i]){
//                max=arreglo[i];
//            }
//        }
//        System.out.println(sumArreglo);
//
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("numero ingresado " + arreglo[i]);
//        }
//        int promedio = sumArreglo / 6;
//        System.out.println("el numero maximo es: " + max);
//*****************************************ejercicio 5
//        int[] arreglo = new int[3];
//        int sumArreglo = 0;
//        int max = 0;
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("Ingrese el numero");
//            arreglo[i] = entrada.nextInt();
//        }
//
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("numero ingresado " + arreglo[i]);
//        }
//
//        int invertido = arreglo.length;
//        System.out.println("Lista invertida");
//        for (int i = 1; i < arreglo.length + 1; i++) {
//
//            System.out.println("numero ingresado " + arreglo[invertido - i]);
//        }
//*****************************************ejercicio 6


        /*
 *PROBLEMA 3
         */
//        System.out.println("Ingrese el salario mensual");
//        int salario = entrada.nextInt();
//        System.out.println("Ingrese el numero de dependientes");
//        int dependientes = entrada.nextInt();
//        float porcentajeDependiente=0;
//        float porcentajeGravable=0;
//
//        switch (dependientes) {
//            case 1:
//                porcentajeDependiente = 100;
//                break;
//            case 2:
//                porcentajeDependiente = 90;
//                break;
//            case 3:
//                porcentajeDependiente = 70;
//                break;
//            case 4:
//                porcentajeDependiente = 60;
//                break;
//            case 5:
//                porcentajeDependiente = 40;
//                break;
//        }
//
//        if (salario < 200000) {
//            porcentajeGravable = 0;
//
//        } else if (salario >= 200000 && salario <= 400000) {
//            porcentajeGravable = 10;
//
//        } else if (salario > 400000 && salario <= 600000) {
//            porcentajeGravable = 15;
//        } else if (salario > 600000 && salario <= 800000) {
//            porcentajeGravable = 20;
//        } else if (salario >= 800000) {
//            porcentajeGravable = 25;
//        }
//        
//        System.out.println("el total de impuesto de renta a pagar es: " + impuestoRenta(salario, porcentajeDependiente, porcentajeGravable));

        /*
 *PROBLEMA 4
         */
//        //se instancia un objeto de la clase GregorianCalendar la cual cuenta con un metodo que ya calcula si un año es bisiesto o no, me parecio super interesante
//        GregorianCalendar calendar = new GregorianCalendar();
//        System.out.println("Ingrese el año que desea validar si es bisiesto");
//        int anio = entrada.nextInt();
//        if (calendar.isLeapYear(anio)) {
//            System.out.println("El año es bisiesto");
//        } else {
//            System.out.println("El año no es bisiesto");
//        }
////        
        //otra forma es 
//        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
//	System.out.println("El año es bisiesto");}
//        else{
//	System.out.println("El año no es bisiesto");
//        }

        /*
 *PROBLEMA 5
         */
        //calcular Pi
// int pi=0;
// int total=0;
// for(int x=3; x<=101; x++){
//     if(x<=7){
//         pi= 4/x;
//     }
//     total+=pi;
// }
// 
        /*
 *PROBLEMA 6
         */
//        int opcion = 0;
//        do {
//            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la operacion que desea realizar: " + "\n"
//                    + "1 para cuadrado" + "\n"
//                    + "2 para rectangulo" + "\n"
//                    + "3 para circulo" + "\n"
//            ));
//        } while (opcion < 1 || opcion > 3);
//        
        

    }
    
//    public int[] ordenarAleatorio(int[] numeros) {
//        int[] resultado = new int[numeros.length];
//        double random = Math.random();
//        
//        
//        return resultado;
//    }
    

    
   
    
//metodo problema 6
//calcular cuadrado
 //   public int area() {
        

    
//calcular rectangulo
    
//calcular circulo
    
    

//    //metodo Problema 4
//    public static float impuestoRenta(int salario, float porcentajeDependiente, float porcentajeGravable) {
//        float iRagravable= salario*(porcentajeDependiente/100);
//        return iRagravable*(porcentajeGravable/100);
//    }




//fin
}