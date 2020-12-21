/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema6;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class SistemaNotasReporte {

    public SistemaNotasReporte() {
    }

    Alumno a;
    Examen e;

    boolean modoGUI = false;

    public String generarReporteTodosExamenes() {
        String reporte = "Reporte examentes: ";
        for (int i = 0; i < SistemaNotas.cont; i++) {
            if (SistemaNotas.examenes[i] != null) {
                if (modoGUI) { //mostrar datos consola
                    reporte += SistemaNotas.examenes[i].toString() + "\n ";
                } else {
                    JOptionPane.showMessageDialog(null, SistemaNotas.examenes[i].toString());
                }
            }
        }
        return reporte;
    }

    public String generarReporteTodosAlumnos() {

        String reporte = "Datos del alumno ingresado: ";
        reporte += a.getNombre() + ", " + a.getApellido() + ", " + a.getCarne();
        return reporte;

    }

    public void generarReporteAlumnosConNotaInferiorA(int nota) {
        String reporte = "Alumnos con nota menor a " + nota;

        for (int i = 0; i < SistemaNotas.cont; i++) {
            if (SistemaNotas.examenes[i] != null) {
                if (nota < e.getNota()) {
                    reporte += reporte += e.getAlumno().getNombre() + ", " + e.getAlumno().getApellido() + ", " + e.getAlumno().getCarne();
                    reporte += "Datos del padre:" + "\n" + "Nombre: " + e.getAlumno().getFamilia().getNombre() + ",apellido:  " + e.getAlumno().getFamilia().getApellido()
                            + ", cedula:  " + e.getAlumno().getFamilia().getCedula() + ""
                            + ", telefono: " + e.getAlumno().getFamilia().getTelefono();

                }
            }
        }

    }

    public void generarReporteTodosExamenesOrdenadosPor(String propiedad) {

    }
}
