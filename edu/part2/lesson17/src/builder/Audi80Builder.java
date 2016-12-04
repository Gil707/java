package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gil on 04-Dec-16.
 */
class Audi80Builder extends CarBuilder {

    void buildMark() {
        car.setMark("AUDI");
    }

    void buildModel() {
        car.setModel("80");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }

    void buildConsumption() {
        car.setConsumption(15);
    }

    void buildPrice() {
        car.setPrice(10400);
    }

    void buildOptions() {
        List<String> audi_options = new ArrayList<>();
        audi_options.add("Кондиционер");
        audi_options.add("Электростеклоподъемники");
        car.setOptions(audi_options);
    }
}
