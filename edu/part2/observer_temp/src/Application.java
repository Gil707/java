
public class Application {
    public static void main(String[] args) {
        Station station = new Station();

        Observer o1 = new FirstObserver();
        station.addObserver(o1);
        station.addObserver(new SecondObserver());
        station.addObserver(new ThirdObserver());

//        station.removeObserver(o1);

        station.setTemp(120);
    }
}
