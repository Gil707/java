package factory.iphone;

import factory.Phone;

import java.util.Date;

public class Iphone implements Phone {
    @Override
    public void showPhone() {
        System.out.println("New Iphone created at: " + new Date());
    }
}
