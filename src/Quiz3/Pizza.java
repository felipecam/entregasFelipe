/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz3;

/**
 *
 * @author fbriceno
 */
public class Pizza {

    String tamaño;
    Ingrediente i1;
    Ingrediente i2;
    Ingrediente i3;
    Ingrediente i4;

    public Pizza(String tamaño, Ingrediente i1, Ingrediente i2, Ingrediente i3, Ingrediente i4) { //4 ingredientes
        this.tamaño = tamaño;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }

    public Pizza(String tamaño, Ingrediente i1, Ingrediente i2) { //2 ingrediente 
        this.tamaño = tamaño;
        this.i1 = i1;
        this.i2 = i2;
    }

    public Pizza(String tamaño, Ingrediente i1, Ingrediente i2, Ingrediente i3) { //3 ingredientes
        this.tamaño = tamaño;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }  
    

    public Pizza() {
    }

    public double calcularPrecio() {
        
        double sumaIngredientes=i1.getPrecio()+ i2.getPrecio()+ i3.getPrecio()+ i4.getPrecio();
        double precio= sumaIngredientes + sumaIngredientes*0.30;
        return precio;   
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Ingrediente getI1() {
        return i1;
    }

    public void setI1(Ingrediente i1) {
        this.i1 = i1;
    }

    public Ingrediente getI2() {
        return i2;
    }

    public void setI2(Ingrediente i2) {
        this.i2 = i2;
    }

    public Ingrediente getI3() {
        return i3;
    }

    public void setI3(Ingrediente i3) {
        this.i3 = i3;
    }

    public Ingrediente getI4() {
        return i4;
    }

    public void setI4(Ingrediente i4) {
        this.i4 = i4;
    }



}
