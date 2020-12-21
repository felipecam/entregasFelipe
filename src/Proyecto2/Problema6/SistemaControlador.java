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

        SistemaNotas sistema = new SistemaNotas();
        PadreFamiliar p = new PadreFamiliar();
        Alumno a = new Alumno(p);
        Examen e = new Examen();
        SistemaNotasInterfaz si = new SistemaNotasInterfaz(true, sistema, a, p, e);

        si.AsignarDatosAlumnos();
        si.AsignarDatosFamilia();
        si.mostrarInformacionAlumno();
        si.mostrarInfromacionFamilia();
        si.AgregarNotas();
        sistema.agregarEx(e);
        si.mostrarExamenes();

    }

}
