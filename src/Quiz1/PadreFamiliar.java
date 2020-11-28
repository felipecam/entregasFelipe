/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author fbriceno
 */
public class PadreFamiliar {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private String telefono;

    public PadreFamiliar() {
    }

    public PadreFamiliar(String nombre, String apellido, int cedula, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "PadreFamiliar{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
