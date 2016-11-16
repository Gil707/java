import geometry.Point;
//import geometry.Shape;
import geometry.Triangle;
// import ui.Panel;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class app {

    private static final String TITLE = "app";

    public static int x, y;
    public static double s;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createUI());
    }

    private static void createUI() {

        Point[] ar = new Point[3];

        java.util.Map<Double, Triangle> shp = new HashMap<Double, Triangle>();


//        JFrame frame = new JFrame(TITLE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Panel panel = new Panel();
//        frame.setSize(800, 800);
//        frame.add(panel);
//        frame.setVisible(false);


//        Rectangle rect = new Rectangle(start,end);
//        panel.setShape(rect);


        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                x = (int) (Math.random() * 500);
                y = (int) (Math.random() * 500);
                ar[j] = new Point(x, y);
            }

            Triangle tr = new Triangle(ar[0], ar[1], ar[2]);
            s = tr.getSq();

            shp.put(s, tr);
        }

        for (Map.Entry<Double, Triangle> item : shp.entrySet()) {
            System.out.println("S = " + item.getKey() + " : " + item.getValue());
        }

        java.util.TreeMap<Double, Triangle> shpTree = new TreeMap<Double, Triangle>(shp);

        System.out.println();


        for (Map.Entry<Double, Triangle> item : shpTree.entrySet()) {
            System.out.println("S = " + item.getKey() + " : " + item.getValue());
//            panel.setShape(item.getValue());
        }

    }
}
