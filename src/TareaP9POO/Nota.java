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
public class Nota {
    
    private int calificacion;

    public Nota(int calificacion) {
        this.calificacion = calificacion;
    }

    public Nota() {
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return ", calificacion= " + calificacion;
    }
    
    
    
}
