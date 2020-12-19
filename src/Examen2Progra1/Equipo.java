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

    int maxRegistros = 100;
    String[] listaAudios = new String[maxRegistros];
    static int cont = 0;

    public Equipo() {
    }

    public void llenarArreglo() {
        for (int i = 0; i < 1000; i++) { //para cada espacio del arreglo
            listaAudios[i] = ""; //inicializamos el espacio de la posición i con un String vacío
        }
    }
    
    public int numAleatorio(){
        int aleatorio = (int) (Math.random() * cont + 1);
        return aleatorio;
    }
    
   // public void agregarAudioLista
    
 

}
