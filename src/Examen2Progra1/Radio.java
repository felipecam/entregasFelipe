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
public class Radio {

    private boolean stado;
    private String audio;

    public Radio() {
    }

    public Radio(boolean stado, String audio) {
        this.stado = stado;
        this.audio = audio;
    }

    public String sonar() {

        return this.getAudio();
    }

    public boolean isStado() {
        return stado;
    }

    public void setStado(boolean stado) {
        this.stado = stado;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

}
