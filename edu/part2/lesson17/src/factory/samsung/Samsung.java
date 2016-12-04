package factory.samsung;

import factory.Phone;

import java.util.Date;

public class Samsung implements Phone {
    @Override
    public void showPhone() {
        System.out.println("New Samsung created at: " + new Date());
    }
}
