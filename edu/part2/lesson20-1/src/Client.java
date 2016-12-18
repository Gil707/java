public class Client extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
            synchronized (Pizzeria.client) {
                System.out.println("1. Client wents to PIZZERIA 'Where is oficiant??? I want some " + Pizzeria.pizza.getName() + "'");
                synchronized (Pizzeria.oficiant) {
                    Pizzeria.oficiant.notify();
                }
                Pizzeria.client.wait();
                sleep(1000);
                System.out.println("6. Client eat own " + Pizzeria.pizza.getName() + " and all goes to bad!");
                System.exit(0);
            }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}