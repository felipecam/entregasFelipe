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
public class Equipo {

    static int maxRegistros = 100;
    static String[] listaAudios = new String[maxRegistros];
    static int posicion = 0;

    public Equipo() {
    }

    public static void llenarArreglo() {
        for (int i = 0; i < maxRegistros; i++) { //para cada espacio del arreglo
            listaAudios[i] = ""; //inicializamos el espacio de la posición i con un String vacío
        }
    }

    public int numAleatorio() {
        int aleatorio = (int) (Math.random() * posicion + 1);
        return aleatorio;
    }

    public static void agregarAudioLista(String audio) {
        listaAudios[posicion]=audio;
        posicion++;
    }

}
