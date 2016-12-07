
public class SecondObserver implements Observer {

    private final String attention = "Orange";

    @Override
    public void handleEvent(int temp) {
        if (temp >= 300 && temp < 900) {
            System.out.println("2st Observer. Изменение температуры : " + temp + " С, уровень опасности = " + attention);
        }
    }
}
