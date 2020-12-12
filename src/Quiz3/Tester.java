/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author fbriceno
 */
public class Tester {

    public static void main(String argv[]) {
        //instancia objeto con los ingredientes, en este caso son valores quemados y se utilizo el constructor para elegir 4 ingredientes
        Pizza p = new Pizza(new Ingrediente("peperoni", "1", 1000), new Ingrediente("jamon", "1", 1500), new Ingrediente("tocino", "1", 1000), new Ingrediente("tocino", "1", 2000));
        JOptionPane.showMessageDialog(null, "El valor de la pizza es: " + p.calcularPrecio() + " colones");
            
    }

}
