package factory.iphone;

import factory.Phone;
import factory.PhoneMaker;
import factory.iphone.Iphone;

public class IphonePhoneMaker implements PhoneMaker {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
