/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class SistemaNotasInterfaz {

    boolean modoGUI;
    SistemaNotas sistema;
    Alumno a;

    Scanner s = new Scanner(System.in);

    public SistemaNotasInterfaz() {
    }

    public SistemaNotasInterfaz(boolean modoGUI, SistemaNotas sistema) {
        this.modoGUI = modoGUI;
        this.sistema = sistema;
    }

    public void puntosExamen() {
        
        int nota,puntosTotales,puntosObtenidos;
       
        if(modoGUI){
        System.out.println("Digite la nota obtenida:");
        nota = s.nextInt();
        System.out.println("Digite puntos totales:");
        puntosTotales = s.nextInt();
        System.out.println("Digite puntos obtenidos:");
        puntosObtenidos = s.nextInt();
        }else{
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota optenida"));
            puntosTotales=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos totales"));
            puntosObtenidos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos obtenidos"));
        
        }
    }

}
