/**
 * Created by Gil on 13-Dec-16.
 */
public class Pizzeria {

    static boolean ready;
    static boolean chiefReady;

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client();
        Oficiant oficiant = new Oficiant();
        Chief chief = new Chief();
        client.start();
        oficiant.start();
        chief.start();
        synchronized (oficiant) {
            oficiant.wait();
        }
        synchronized (chief) {
            chief.wait();
        }
    }

    static class Client extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Client is in the Pizzeria");
                ready = true;
                notify();
            }

        }
    }

    static class Oficiant extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (this) {
                    if (ready) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Oficiant wake up");
                        ready = false;
                        chiefReady = true;
                    }
                }
            }

        }
    }
    static class Chief extends Thread {
        @Override
        public void run() {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    if (chiefReady) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Chief wake up and makes pizza");
                        chiefReady = false;
                        break;
                    }
                }
            }

        }
    }

}
