/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Progra1;

/**
 *
 * @author fbriceno
 */
public class Parlante {

    private String tipo;//si es izquierdo, derecho o de graves
    private int volumen;
    private boolean estado;

    public Parlante() {
    }

    public Parlante(String tipo, int volumen, boolean estado) {
        this.tipo = tipo;
        this.volumen = volumen;
        this.estado = estado;
    }    

    public String sonar(String audio) {

        return audio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    

}
