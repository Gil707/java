package factory.samsung;

import factory.Phone;
import factory.PhoneMaker;
import factory.samsung.Samsung;

public class SamsungPhoneMaker implements PhoneMaker {
    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
