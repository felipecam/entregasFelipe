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
public class SistemaControlador {

    public void iniciar() {
        while (true) {

            SistemaNotas sistema = new SistemaNotas();
            PadreFamiliar p = new PadreFamiliar();
            Alumno a = new Alumno(p);
            Examen e = new Examen();
            SistemaNotasInterfaz si = new SistemaNotasInterfaz(false, sistema, a, p, e);

            si.AsignarDatosAlumnos();
            si.AsignarDatosFamilia();
            si.mostrarInformacionAlumno();
            si.mostrarInfromacionFamilia();
            si.AgregarNotas();
            sistema.agregarEx(e);
            si.mostrarExamenes();      
            if (si.continuar().equalsIgnoreCase("no")) {
                break; // Agregue un break en un ciclo o una estructura break/continue (1pto).
            }

        }
    }
}
