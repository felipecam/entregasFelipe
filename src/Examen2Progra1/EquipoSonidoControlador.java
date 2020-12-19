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
        boolean salirPrograma = false;
        Parlante pDerecho = new Parlante("Derecho", 10, true);
        Parlante pIzquierdo = new Parlante("Izquierdo", 10, true);
        Parlante pSubwoofer = new Parlante("Subwoofer", 10, true);
        Radio rad = new Radio(false, "10010");
        Reloj r = new Reloj();
        Vista v = new Vista(rad);
        EquipoSonido.llenarArreglo();
        int opcionMenuPrincipal = 0;
        do {
            opcionMenuPrincipal = v.opcionMenuPrincipal();

            if (opcionMenuPrincipal == 1) {
                int op = 0;
                boolean salir = false;
                do {
                    op = v.opcionesEquipo();
                    if (op == 1) {
                        v.reproducir();
                        v.cancionParlante(pDerecho);

                    }
                    if (op == 2) {
                        v.imprimirListaCompleta();
                    }
                    if (op == 3) {
                        v.imprimirListaCompleta();
                    }
                    if (op == 4) {
                        String audioAgregado = v.agregarAudio();
                        EquipoSonido.agregarAudioLista(audioAgregado);

                    }
                    if (op == 5) {
                        int seleccionarCancionBorrar = v.seleccionarCancionBorrar();
                        EquipoSonido.eliminarAudioArreglo(seleccionarCancionBorrar);
                    }
                    if (op == 6) {
                        salir = true;
                    }
                } while (!salir);
            }

            if (opcionMenuPrincipal == 2) {
                v.seleccionarRadio();
            }

            if (opcionMenuPrincipal == 6) {
                salirPrograma = true;
            }


        } while (!salirPrograma);
    }

}
