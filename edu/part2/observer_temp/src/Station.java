import java.util.ArrayList;
import java.util.List;

public class Station implements Observed {

    int temperature;

    List<Observer> observers = new ArrayList<>();

    public void setTemp(int t) {
        temperature = t;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers
             ) {
            o.handleEvent(temperature);
        }
    }
}
