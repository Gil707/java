package builder;

import java.util.List;

enum Transmission {
    AUTO, MANUAL
}

public class Car {
    String mark;
    String model;
    Transmission transmission;
    int maxSpeed;
    int consumption;
    int price;
    List<String> options;

    public void setMark(String mark) {        this.mark = mark;    }
    public void setModel(String model) {        this.model = model;    }
    public void setTransmission(Transmission transmission) {        this.transmission = transmission;    }
    public void setMaxSpeed(int maxSpeed) {        this.maxSpeed = maxSpeed;    }
    public void setConsumption(int consumption) {        this.consumption = consumption;    }
    public void setPrice(int price) {        this.price = price;    }
    public void setOptions(List<String> options) {        this.options = options;    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + mark + '\'' +
                ", Модель='" + model + '\'' +
                ", Трансмиссия=" + transmission +
                ", Макс. скорость=" + maxSpeed +
                ", Расход(л/100км)=" + consumption +
                ", Цена=" + price + "$" +
                ", Опции=" + options +
                '}';
    }
}
