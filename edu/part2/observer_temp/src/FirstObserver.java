
public class FirstObserver implements Observer {

    private final String attention = "Yellow";

    @Override
    public void handleEvent(int temp) {
        if (temp > 100 && temp < 300) {
            System.out.println("1st Observer. Изменение температуры : " + temp + " С, уровень опасности = " + attention);
        }
    }
}
