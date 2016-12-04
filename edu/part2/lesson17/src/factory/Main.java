package factory;

import factory.asus.AsusPhoneMaker;
import factory.iphone.IphonePhoneMaker;
import factory.samsung.SamsungPhoneMaker;

public class Main {

    public static void main(String[] args) {
        PhoneMaker maker = getPhoneMaker("iphone");
        Phone phone = maker.createPhone();
        phone.showPhone();

        PhoneMaker maker1 = getPhoneMaker("asus");
        Phone phone1 = maker1.createPhone();
        phone1.showPhone();

        PhoneMaker maker2 = getPhoneMaker("123");
        Phone phone2 = maker2.createPhone();
        phone2.showPhone();


    }

    public static PhoneMaker getPhoneMaker(String phone) {
        if (phone.equalsIgnoreCase("iphone")) {
            return new IphonePhoneMaker();
        } else if (phone.equalsIgnoreCase("samsung")) {
            return new SamsungPhoneMaker();
        } else if (phone.equalsIgnoreCase("asus")) {
            return new AsusPhoneMaker();
        }

        throw new RuntimeException("Unknown name " + phone);
    }
}
