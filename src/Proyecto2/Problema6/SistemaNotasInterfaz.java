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
    PadreFamiliar p;

    Scanner s = new Scanner(System.in);

    public SistemaNotasInterfaz() {
        
    }

    public SistemaNotasInterfaz(boolean modoGUI, SistemaNotas sistema, Alumno a, PadreFamiliar p) {
        this.modoGUI = modoGUI;
        this.sistema = sistema;
        this.a = a;
        this.p = p;
    }

    //interfaz examen
    public void AgregarExamen() {

        int nota, puntosTotales, puntosObtenidos;

        if (modoGUI) {
            System.out.println("Digite la nota obtenida:");
            nota = s.nextInt();
            System.out.println("Digite puntos totales:");
            puntosTotales = s.nextInt();
            System.out.println("Digite puntos obtenidos:");
            puntosObtenidos = s.nextInt();
        } else {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota optenida"));
            puntosTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos totales"));
            puntosObtenidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos obtenidos"));
        }
        
    }

    public void mostrarExamenes() {
        for (int i = 0; i < sistema.cont; i++) {
            if (sistema.examenes[i] != null) {
                System.out.println(sistema.examenes[i].toString());
            }
        }
    }

    //interfaz alumno
    public void mostrarInformacionAlumno() {
        if (modoGUI) {  //mostrar datos consola
            System.out.println("Datos del alumno ingresado:" + "\n" + a.getNombre() + " " + a.getApellido() + " " + a.getCarne());
        } else {  //mostrar datos joptionPane
            JOptionPane.showMessageDialog(null, "Datos del alumno ingresado:" + "\n" + a.getNombre() + " " + a.getApellido() + " " + a.getCarne());
        }
    }

    public void mostrarInfromacionFamilia() {
        if (modoGUI) { //mostrar datos consola
            System.out.println("Datos del padre ingresado:" + "\n" + "Nombre: " + a.getFamilia().getNombre() + ",apellido:  " + a.getFamilia().getApellido() + ", cedula:  " + a.getFamilia().getCedula() + ""
                    + ", telefono: " + a.getFamilia().getTelefono());
        } else { //mostrar datos usando joptionpane
            JOptionPane.showMessageDialog(null, "Datos del padre ingresado:" + "\n" + "Nombre: " + a.getFamilia().getNombre() + ",apellido:  " + a.getFamilia().getApellido() + ", cedula:  " + a.getFamilia().getCedula() + ""
                    + ", telefono: " + a.getFamilia().getTelefono());
        }
    }

    public void AsignarDatosAlumnos() {

        String x, y;
        int z;
        if (modoGUI) { //mostrar datos consola
            System.out.println("Digite el nombre del alumno:");
            x = s.next();
            System.out.println("Digite el apellido del alumno:");
            y = s.next();
            System.out.println("Digite el carne:");
            z = s.nextInt();
        } else {
            x = JOptionPane.showInputDialog("Digite el nombre del alumno:");
            y = JOptionPane.showInputDialog("Digite el apellido del alumno:");
            z = Integer.parseInt(JOptionPane.showInputDialog("Digite el carne:"));
        }

        a.setNombre(x);
        a.setApellido(y);
        a.setCarne(z);
    }

    public void AsignarDatosFamilia() {

        String nombreFamiliar, ApellidoFamiliar, numeroTel;
        int cedula;
        if (modoGUI) { //mostrar datos consola
            System.out.println("Digite el nombre del padre:");
            nombreFamiliar = s.next();
            System.out.println("Digite el apellido del padre:");
            ApellidoFamiliar = s.next();
            System.out.println("Digite la cedula del padre:");
            cedula = s.nextInt();
            System.out.println("Digite el numero de telefono del padre:");
            numeroTel = s.next();
        } else {
            nombreFamiliar = JOptionPane.showInputDialog("Digite el nombre del alumno:");
            ApellidoFamiliar = JOptionPane.showInputDialog("Digite el nombre del alumno:");
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el carne:"));
            numeroTel = JOptionPane.showInputDialog("Digite el nombre del alumno:");
        }

        p.setNombre(nombreFamiliar);
        p.setApellido(ApellidoFamiliar);
        p.setCedula(cedula);
        p.setTelefono(numeroTel);
    }

}
