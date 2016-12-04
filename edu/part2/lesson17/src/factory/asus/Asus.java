package factory.asus;

import factory.Phone;

import java.util.Date;

public class Asus implements Phone {
    @Override
    public void showPhone() {
        System.out.println("New Asusphone created at: " + new Date());
    }
}
