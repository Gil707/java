package factory.asus;

import factory.Phone;
import factory.PhoneMaker;

public class AsusPhoneMaker implements PhoneMaker {
    @Override
    public Phone createPhone() {
        return new Asus();
    }
}
