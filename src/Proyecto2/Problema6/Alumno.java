package Proyecto2.Problema6;

public class Alumno {

    String nombre;
    String apellido;
    int carne;
    PadreFamiliar familia; //atributo tipo PadreFamiliar
    PadreFamiliar madre; //atributo tipo

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public Alumno(String nombre, String apellido, int carne, PadreFamiliar familia) { //constructor solo padre
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.familia = familia; //constructor para agregar este atributo durante la creacioon del objeto
    }

    public Alumno(String nombre, String apellido, int carne, PadreFamiliar familia, PadreFamiliar madre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.familia = familia;
        this.madre = madre;
    }

    public Alumno(PadreFamiliar familia) {
        this.familia = familia;
    }
    
    

    //1 Agregue una sobrecarga en un contructor (1pto).
    public Alumno(String nombre) {
        this.nombre = "Felipe";
    }

    public void mostrardatos() {
        System.out.println("Datos del alumno ingresado:" + "\n" + nombre + " " + apellido + " " + carne);
    }

    public void mostrardatosFamiliar() {
        System.out.println("Datos del padre ingresado:" + "\n" + "Nombre: " + familia.getNombre() + ",apellido:  " + familia.getApellido() + ", cedula:  " + familia.getCedula() + ""
                + ", telefono: " + familia.getTelefono() + "\n"
                + "Datos de la madre ingresada:" + "\n" + "Nombre: " + madre.getNombre() + ",apellido:  " + madre.getApellido() + ", cedula:  " + madre.getCedula() + ""
                + ", telefono: " + madre.getTelefono());
    }

    public void mostrardatosMadre() {
        System.out.println("Datos de la madre ingresada:" + "\n" + "Nombre: " + madre.getNombre() + ",apellido:  " + madre.getApellido() + ", cedula:  " + madre.getCedula() + ""
                + ", telefono: " + madre.getTelefono());
    }

    //metodos gets y sets
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

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public PadreFamiliar getFamilia() {
        return familia;
    }

    public void setFamilia(PadreFamiliar familia) {
        this.familia = familia;
    }

    public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }

}
