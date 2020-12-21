/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2.Problema6;

import java.util.Date;

public class Examen {
    Alumno alumno;
    int nota;
    String nombreMateria;
    int puntosTotal;
    int puntosObtenidos;
    Date fecha;

    public Examen(){
    }
    
    public Examen(Alumno alumno, int nota, int puntosTotal, int puntosObtenidos, Date fecha) {
        this.alumno = alumno;
        this.nota = nota;
        this.puntosTotal = puntosTotal;
        this.puntosObtenidos = puntosObtenidos;
        this.fecha = fecha;
    }

    public Examen(int nota, String nombreMateria, int puntosTotal, int puntosObtenidos, Date fecha) {
        this.nota = nota;
        this.nombreMateria = nombreMateria;
        this.puntosTotal = puntosTotal;
        this.puntosObtenidos = puntosObtenidos;
        this.fecha = fecha;
    }

    public Examen(String nombreMateria, int puntosTotal, Date fecha) {
        this.nombreMateria = nombreMateria;
        this.puntosTotal = puntosTotal;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Examen: " + "nota=" + nota + ", nombreMateria=" + nombreMateria + ", puntosTotal=" + puntosTotal + ", puntosObtenidos=" + puntosObtenidos ;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    } 
}