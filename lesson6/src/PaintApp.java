import geometry.*;
import geometry.Point;
import geometry.Rectangle;
import geometry.Triangle;
import ui.Panel;

import javax.swing.*;
import java.awt.*;

public class PaintApp {

    private static final String TITLE = "Paint";


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createUI());
    }

    private static void createUI() {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.setSize(800, 800);
        frame.add(panel);
        frame.setVisible(true);

        Point a = new Point(50,50);
        Point b = new Point(350,120);
        Point c = new Point(400,500);
//        Rectangle rect = new Rectangle(start,end);
//        panel.setShape(rect);

        Panel panel1 = new Panel();
        panel.add(panel1);
        Panel panel2 = new Panel();
        panel1.add(panel2);
        Panel panel3 = new Panel();
        panel2.add(panel3);

        panel3.setShape(new Rectangle(b, c));
        panel2.setShape(new Triangle(a, b, c));
        panel1.setShape(new Circle(b, 45));
        panel.setShape(new Circle(b, 80));

    }
}
