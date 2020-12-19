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

    EquipoSonido e;
    Parlante p1, p2, p3;

    public int opcionesEquipo() {
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
            if (EquipoSonido.listaAudios[i].equals("") == false) { //Si no está vacío el audio en posición i
                System.out.println(EquipoSonido.listaAudios[i]); //imprime el audio en posición i
            }
        }
    }

    public int seleccionarParlante() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el parlante que desea subir o bajar volumen\n1.derecho\n2. izquierdo"
                + "\nSubwoofer"));
        return op;
    }

    //parlantes
    public int seleccionarCancionBorrar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cancion que desea borrar"));
        return num;
    }

    public int volumenParlante() {
        int vol = 0;
        do {
            vol = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el volumen del parlante, la opcion debe ser del 1 al 10"));
        } while (vol <= 0 || vol >= 11);
        return vol;
    }

    public void ParlanteEncendido() {
        JOptionPane.showMessageDialog(null, "Parlante encendido");
    }

    public void ParlanteApagado() {
        JOptionPane.showMessageDialog(null, "Parlante apagado");
    }

}
