package Proyecto2.Problema3;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para dibujar
 */
public class JPanelDibujo extends JPanel {

    Rectangulo r = new Rectangulo();
    Ovalo o = new Ovalo();

    /* 
   * Constructor del panel para dibujar
     */
    public JPanelDibujo() {
        this.setBackground(Color.LIGHT_GRAY);
    }

    // Reimplementa paint
    public void paint(Graphics g) {
        super.paint(g);

        int cant = (int) (Math.random() * 2 + 1);
        //RECTANGULOS
        for (int i = 0; i <= cant; i++) {
            int x = (int) (Math.random() * 600 + 1);
            int y = (int) (Math.random() * 150 + 22);
            int height = (int) (Math.random() * 100 + 25);
            int width = (int) (Math.random() * 100 + 25);
            r.setX(x);
            r.setY(y);
            r.setHeight(height);
            r.setWidth(width);
            g.setColor(Color.black);
            g.drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());

        }
        
        g.drawLine(3000, 280, 1, 280); //dibuja una línea para separa ovalos de rectangulos
        
        //OVALOS
        for (int i = 0; i <= cant; i++) {
            int x = (int) (Math.random() * 600 + 1);
            int y = (int) (Math.random() * 150 + 310);
            int height = (int) (Math.random() * 100 + 25);
            int width = (int) (Math.random() * 100 + 25);
            o.setX(x);
            o.setY(y);
            o.setHeight(height);
            o.setWidth(width);
            g.setColor(Color.black);
            g.drawOval(o.getX(), o.getY(), o.getWidth(), o.getHeight());

        }

        // STRINGS
        Font fuente = new Font("Arial", Font.BOLD, 12);
        g.setColor(Color.black);
        g.setFont(fuente);
        g.drawString("Rectangulos:", 5, 22);
        g.drawString("Ovalos:", 5, 305);

    }

}
