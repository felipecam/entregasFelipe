/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

/**
 *
 * @author fbriceno
 */
public class Compugramas {

    public static void main(String[] args) {

        int tam = 5;
//        System.out.println("Compugrama 1:");
//
//        for (int i = 0; i <= tam; i++) {
//            System.out.print(" - ");
//            if (i == tam) {
//                System.out.println(" >");
//            }
//        }
//
//        System.out.println("Compugrama 2: ");
//        for (int i = 0; i < 3; i++) {
//            for (int x = 0; x <= tam; x++) {
//                System.out.print(" - ");
//                if (x == tam) {
//                    System.out.print(" >");
//                }
//            }
//             System.out.println("");
//        }

        System.out.println("Compugrama 3: ");
        for (int i = 0; i <= 5; i++) {
            if (i == 0 || i == 4) {
                for (int x = 0; x < 3; x++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

    }

}
