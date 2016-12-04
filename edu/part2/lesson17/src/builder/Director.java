package builder;

/**
 * Created by Gil on 04-Dec-16.
 */
public class Director {
    CarBuilder builder;
    void  setBuilder(CarBuilder b) {
        builder = b;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildMark();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        builder.buildConsumption();
        builder.buildPrice();
        builder.buildOptions();
        Car car = builder.getCar();

        return car;
    }
}
