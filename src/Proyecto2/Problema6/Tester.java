/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema6;

/**
 *
 * @author fbriceno
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tester {

    //SistemaNotasControlador c = new SistemaNotasControlador();
    //c.iniciar(); //version final
    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
        Scanner s = new Scanner(System.in);
        PadreFamiliar p = new PadreFamiliar();
        PadreFamiliar m = new PadreFamiliar();

        while (true) {
            //asingar datos alumno
            System.out.println("Digite el nombre del alumno:");
            String x = s.next();
            System.out.println("Digite el apellido del alumno:");
            String y = s.next();
            System.out.println("Digite el carne:");
            int z = s.nextInt();

            //ingresar datos padre 
            System.out.println("Digite el nombre del padre:");
            String nombreFamiliar = s.next();
            System.out.println("Digite el apellido del padre:");
            String ApellidoFamiliar = s.next();
            System.out.println("Digite la cedula del padre:");
            int cedula = s.nextInt();
            System.out.println("Digite el numero de telefono del padre:");
            String numeroTel = s.next();

            //ingresar datos madre
            System.out.println("Digite el nombre de la madre:");
            String nombreM = s.next();
            System.out.println("Digite el apellido de la madre:");
            String apellidoM = s.next();
            System.out.println("Digite la cedula de la madre:");
            int cedulaM = s.nextInt();
            System.out.println("Digite el numero de telefono de la madre:");
            String numeroTelM = s.next();

            //asignar valores al objeto
            p.setNombre(nombreFamiliar);
            p.setApellido(ApellidoFamiliar);
            p.setCedula(cedula);
            p.setTelefono(numeroTel);

            m.setNombre(nombreM);
            m.setApellido(apellidoM);
            m.setCedula(cedulaM);
            m.setTelefono(numeroTelM);

            //crear el alumno con el objeto familia
            Alumno alum = new Alumno(x, y, z, p, m);

            System.out.println("Digite la nota obtenida:");
            int nota = s.nextInt();
            System.out.println("Digite puntos totales:");
            int puntosTotales = s.nextInt();
            System.out.println("Digite puntos obtenidos:");
            int puntosObtenidos = s.nextInt();

            Examen e = new Examen(alum, nota, puntosTotales,
                    puntosObtenidos, null);

            sistema.agregarEx(e);
            alum.mostrardatos();
            alum.mostrardatosFamiliar();
            sistema.mostrarExamenes();

            System.out.println("Seguir agregando si/no");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("no")) {
                break; // Agregue un break en un ciclo o una estructura break/continue (1pto).
            }
        }

    }
}
