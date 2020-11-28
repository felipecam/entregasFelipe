/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        SistemaNotas sistema = new SistemaNotas();
        Scanner s = new Scanner(System.in);
        PadreFamiliar p = new PadreFamiliar();

        while (true) {
            //asingar datos alumno
            System.out.println("Digite el nombre del alumno:");
            String x = s.next();
            System.out.println("Digite el apellido del alumno:");
            String y = s.next();
            System.out.println("Digite el carne:");
            int z = s.nextInt();
            
            //ingresar datos familiar 
            System.out.println("Digite el nombre del familiar:");
            String nombreFamiliar = s.next();
            System.out.println("Digite el apellido del familiar:");
            String ApellidoFamiliar = s.next();
            System.out.println("Digite la cedula del familiar:");
            int cedula = s.nextInt();
            System.out.println("Digite el numero de telefono del familiar:");
            //asignar valores al objeto
            String numeroTel = s.next();
            p.setNombre(nombreFamiliar);
            p.setApellido(ApellidoFamiliar);
            p.setCedula(cedula);
            p.setTelefono(numeroTel);
            
            //crear el alumno con el objeto familia
            Alumno alum = new Alumno(x, y, z, p);

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

        }

    }
}
