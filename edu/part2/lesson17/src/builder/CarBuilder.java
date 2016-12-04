package builder;

abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMark();

    abstract void buildModel();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    abstract void buildConsumption();

    abstract void buildPrice();

    abstract void buildOptions();

    Car getCar() {
        return car;
    }
}

//public class CarBuilder {
//
//    String mark = "Noname";
//    String model = "Noname";
//    Transmission transmission = Transmission.MANUAL;
//    int maxSpeed = 150;
//    int consumption = 12;
//    int price = 10000;
//
//    CarBuilder buildMark (String mark) {
//        this.mark = mark;
//        return this;
//    }
//    CarBuilder buildModel (String model) {
//        this.model = model;
//        return this;
//    }
//    CarBuilder buildTransmission (Transmission transmission) {
//        this.transmission = transmission;
//        return this;
//    }
//    CarBuilder buildMaxSpeed (int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//        return this;
//    }
//    CarBuilder buildConsumption (int consumption) {
//        this.consumption = consumption;
//        return this;
//    }
//    CarBuilder buildPrice (int price) {
//        this.price = price;
//        return this;
//    }
//
//    Car build() {
//        Car car = new Car();
//        car.setMark(mark);
//        car.setModel(model);
//        car.setTransmission(transmission);
//        car.setMaxSpeed(maxSpeed);
//        car.setConsumption(consumption);
//        car.setPrice(price);
//
//        return car;
//    }
//}
