package ui;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import geometry.Shape;

public class Panel extends JPanel {

//  private Shape shape;
    private java.util.List<Shape> shapes = new ArrayList<Shape>();          // создадим коллекции элементов

    public Panel() {
        //  setBorder(BorderFactory.createLineBorder(Color.white));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 800);
    }

    @Override
    public void paintComponent(Graphics g) {
//      super.paintComponent(g);    рисуем с помощью paint ниже.

        /*  Если в лоб, линиями
        g.drawRect(150, 150, 180, 450);
        g.drawLine(150, 150, 240, 50);
        g.drawLine(240, 50, 330, 150);
        g.drawOval(200, 200, 80, 80);
        g.drawOval(200, 300, 80, 80);
        g.drawOval(200, 400, 80, 80);
        g.drawLine(180, 600, 150, 700);
        g.drawLine(200, 600, 230, 700);
        g.drawLine(280, 600, 250, 700);
        g.drawLine(300, 600, 330, 700);
        */

        if(shapes != null){                         // выведем каждый элемент коллекции в канву
            for (Shape sh : shapes) {
                sh.paint(g);
            }
        }

    }


    public void setShape(Shape shape) {
        this.shapes.add(shape);
//   repaint();               необязательно перерисовывать
    }


}
