package singletone;

/**
 * Created by Gil on 04-Dec-16.
 */
public class SingletonApp {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("It's Singletone # " + s.counter);
        System.out.println("It's Singletone # " + s2.counter);
        System.out.println("It's Singletone # " + s3.counter);

    }
}
