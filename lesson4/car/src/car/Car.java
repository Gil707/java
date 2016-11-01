package car;

import car.inner.Engine;
import car.outer.Body;

/**
 * Created by Gil on 31-Oct-16.
 */
public class Car {

    public Car(Engine engine, Body body) {
        this.engine = engine;
        this.body = body;
    }

    private Engine engine;
    private Body body;

    public void move() {
        while (engine.checkWorking()) {
            engine.start();
        }

        body.move();
        engine.stop();
    }
}
