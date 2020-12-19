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
        Reloj r = new Reloj();
        EquipoSonido e = new EquipoSonido(r);
        boolean salirPrograma = false;
        Parlante pDerecho = new Parlante("Derecho", 10, true);
        Parlante pIzquierdo = new Parlante("Izquierdo", 10, true);
        Parlante pSubwoofer = new Parlante("Subwoofer", 10, true);
        Radio rad = new Radio(false, "10010");
        Vista v = new Vista(e,rad);
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

            if (opcionMenuPrincipal == 2) { //usar radio
                v.seleccionarRadio();
            }
            if (opcionMenuPrincipal == 3) { //configurar volumen parlante
                int seleccionarParlante = v.seleccionarParlante();
                if (seleccionarParlante == 1) {
                    int volumenParlante = v.volumenParlante();
                    pDerecho.setVolumen(volumenParlante);
                }
                if (seleccionarParlante == 2) {
                    int volumenParlante = v.volumenParlante();
                    pIzquierdo.setVolumen(volumenParlante);
                }
                if (seleccionarParlante == 3) {
                    int volumenParlante = v.volumenParlante();
                    pSubwoofer.setVolumen(volumenParlante);
                }
            }

            if (opcionMenuPrincipal == 4) { //encender/apagar parlante
                int seleccionarParlante = v.seleccionarParlante();
                if (seleccionarParlante == 1) {
                    int parlanteEncApag = v.parlanteEncApag(); //selecionar si quiere encender o apagar
                    if (parlanteEncApag == 1) {
                        pDerecho.setEstado(true);
                        v.ParlanteEncendido();
                    } else {
                        pDerecho.setEstado(false);
                        v.ParlanteApagado();
                    }
                }
                if (seleccionarParlante == 2) {
                    int parlanteEncApag = v.parlanteEncApag(); //selecionar si quiere encender o apagar
                    if (parlanteEncApag == 1) {
                        pIzquierdo.setEstado(true);
                        v.ParlanteEncendido();
                    } else {
                        pIzquierdo.setEstado(false);
                        v.ParlanteApagado();
                    }
                }
                if (seleccionarParlante == 4) {
                    int parlanteEncApag = v.parlanteEncApag(); //selecionar si quiere encender o apagar
                    if (parlanteEncApag == 1) {
                        pSubwoofer.setEstado(true);
                        v.ParlanteEncendido();
                    } else {
                        pSubwoofer.setEstado(false);
                        v.ParlanteApagado();
                    }
                }

            }

            if (opcionMenuPrincipal == 5) { //Salir
                v.hora();
                
            }

            if (opcionMenuPrincipal == 6) { //Salir
                salirPrograma = true;
            }

        } while (!salirPrograma);
    }

}
