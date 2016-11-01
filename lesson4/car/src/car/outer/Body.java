package car.outer;

/**
 * Created by Gil on 31-Oct-16.
 */
public class Body {

    private static final int WHEEL_NUMBER = 4;

    private Color color;
    private Wheels[] wheels;

    public Body(Color color){
        this.color = color;
        this.wheels = new Wheels[WHEEL_NUMBER];

        for(int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheels();
        }
    }

    public void move() {
        System.out.println(toString() + " is moving");
        for (Wheels w: wheels) {
            w.rotate();
        }
    }
}
