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
        int cancionActual = 0;
        EquipoSonido e = new EquipoSonido();
        Vista v = new Vista();
        Parlante pDerecho = new Parlante("Derecho", 10, true);
        Parlante pIzquierdo = new Parlante("Izquierdo", 10, true);
        Parlante pSubwoofer = new Parlante("Subwoofer", 10, true);
        Radio rad = new Radio();
        Reloj r = new Reloj();

        EquipoSonido.llenarArreglo();
        for (int i = 0; i < 3; i++) {
            String audioAgregado = v.agregarAudio();
            EquipoSonido.agregarAudioLista(audioAgregado);
        }
        v.imprimirListaCompleta();
        pDerecho.sonar(EquipoSonido.listaAudios[cancionActual]);
        EquipoSonido.eliminarAudioArreglo(cancionActual);
        v.imprimirListaCompleta();

    }

}
