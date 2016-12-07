
public class ThirdObserver implements Observer {

    private final String attention = "Red";

    @Override
    public void handleEvent(int temp) {
        if (temp >= 900) {
            System.err.println("3rd Observer. Изменение температуры : " + temp + " С, уровень опасности = " + attention);
        }
    }
}
