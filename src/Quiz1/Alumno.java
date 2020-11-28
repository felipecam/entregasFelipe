package Quiz1;

public class Alumno {

    String nombre;
    String apellido;
    int carne;
    PadreFamiliar familia; //atributo tipo PadreFamiliar

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }

    public Alumno(String nombre, String apellido, int carne, PadreFamiliar familia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.familia = familia; //constructor para agregar este atributo durante la creacioon del objeto
    }

    public void mostrardatos() {
        System.out.println("Datos del alumno ingresado:" + "\n" + nombre + " " + apellido + " " + carne);
    }

    public void mostrardatosFamiliar() {
        System.out.println("Datos del familiar ingresado:" + "\n" + "Nombre: " + familia.getNombre() + ",apellido:  " + familia.getApellido() + ", cedula:  " + familia.getCedula() + ""
                + ", telefono: " + familia.getTelefono());
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

}
