package builder;

/**
 * Created by Gil on 04-Dec-16.
 */
public class BuilderApp {
    public static void main(String[] args) {

//        Car carBmw = new CarBuilder()
//                .buildMark("BMW")
//                .buildModel("F30")
//                .buildTransmission(Transmission.AUTO)
//                .buildMaxSpeed(250)
//                .buildConsumption(13)
//                .buildPrice(22500)
//                .build();
//
//        Car carAudi = new CarBuilder()
//                .buildMark("Audi")
//                .buildModel("80")
//                .buildTransmission(Transmission.AUTO)
//                .buildMaxSpeed(180)
//                .buildConsumption(15)
//                .buildPrice(10400)
//                .build();
//
//        System.out.println(carBmw);
//        System.out.println(carAudi);

        Director director = new Director();
        director.setBuilder(new BmwF30Builder());
        Car bmw = director.buildCar();

        director.setBuilder(new Audi80Builder());
        Car audi = director.buildCar();

        System.out.println(bmw);
        System.out.println(audi);

    }
}
