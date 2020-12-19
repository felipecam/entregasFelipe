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
public class EquipoSonidoControlador {

    public void iniciar() {
        Equipo e = new Equipo();
        Vista v = new Vista();
        Parlante pDerecho = new Parlante();
        Parlante pIzquierdo = new Parlante();
        Parlante pSubwoofer = new Parlante();
        Radio rad = new Radio();
        Reloj r = new Reloj();
        
        Equipo.llenarArreglo();
        for (int i = 0; i < 4; i++) {
            String audioAgregado = v.agregarAudio();
            Equipo.agregarAudioLista(audioAgregado);
        }
        v.imprimirListaCompleta();

    }

}
