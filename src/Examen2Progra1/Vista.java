/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Progra1;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class Vista {

    Equipo e = new Equipo();

    public int getOpcionLista() {
        int o = 0;
        try {
            o = Integer.parseInt(JOptionPane.showInputDialog("1. Reproducir la lista en orden\n2. Reproducir la lista en forma aleatoria\n3.Mostrar la lista completa"
                    + "\n4.Agregar nuevo audio\n3.Eliminar audio\n3.Salir."));
            if ((o < 1) || (o > 6)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return o;
    }

    public String agregarAudio() {
        String audio = JOptionPane.showInputDialog("Ingrese el audio a la lista");
        return audio;
    }

    public void imprimirListaCompleta() {
        
        System.out.println("Lista de audios: ");
        for (int i = 0; i < 100; i++) { //para cada espacio del arreglo
            if (Equipo.listaAudios[i].equals("") == false) { //Si no está vacío el audio en posición i
                System.out.println(Equipo.listaAudios[i]); //imprime el audio en posición i
            }
        }
    }
}
