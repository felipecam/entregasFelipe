/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaP9POO;

/**
 *
 * @author fbriceno
 */
public class Estudiante {

    private int carne;
    private String nombre;
    private String Apellido;
    private String seccion;
    private String sexo;
    private Nota nota;

    public Estudiante(int carne, String nombre, String Apellido, String seccion, String sexo, Nota nota) {
        this.carne = carne;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.seccion = seccion;
        this.sexo = sexo;
        this.nota = nota;
    }

    public Estudiante() {
    }
    
    

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Informacion del estudiante: "
                + "carne=" + carne + ", nombre=" + nombre + ", Apellido=" + Apellido + ", seccion=" + seccion + ", sexo=" + sexo  + nota;
    }

}
