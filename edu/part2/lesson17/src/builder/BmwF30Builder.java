package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gil on 04-Dec-16.
 */
class BmwF30Builder extends CarBuilder {

    void buildMark() {
        car.setMark("BMW");
    }

    void buildModel() {
        car.setModel("F30");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }

    void buildConsumption() {
        car.setConsumption(13);
    }

    void buildPrice() {
        car.setPrice(22500);
    }

    void buildOptions() {
        List<String> bmw_options = new ArrayList<>();
        bmw_options.add("Климат контроль");
        bmw_options.add("Электростеклоподъемники");
        bmw_options.add("Датчик света");
        bmw_options.add("Датчик дождя");
        bmw_options.add("Парктроники");
        bmw_options.add("Омыватель фар");
        car.setOptions(bmw_options);
    }
}
