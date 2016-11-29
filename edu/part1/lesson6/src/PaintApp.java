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

        panel.setShape(new Circle(b, 80));
        panel.setShape(new Circle(a, 50));
        panel.setShape(new Circle(c, 80));
        panel.setShape(new Triangle(a, b, c));
        panel.setShape(new Rectangle(a, b));

    }
}
