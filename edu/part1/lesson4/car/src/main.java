import car.Car;
import car.inner.Engine;
import car.outer.Body;
import car.outer.Color;

/**
 * Created by Gil on 31-Oct-16.
 */
public class main {

    public static void main(String[] args) {
        Engine engine = new Engine(8);
        Body body = new Body(new Color(0xffffff, Color.TYPE.METALLIC));
        Car car = new Car(engine,body);

        car.move();
    }
}
