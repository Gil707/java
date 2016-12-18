public class Oficiant extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (Pizzeria.oficiant) {
                    Pizzeria.oficiant.wait();

                    Thread.sleep(2000);
                    System.out.println("2. Oficiant wake up and get the order. Waking the Cook...");
                    Thread.sleep(2000);

                    synchronized (Pizzeria.cook) {
                        Pizzeria.cook.notify();
                    }

                    Pizzeria.oficiant.wait();
                    Thread.sleep(1000);
                    System.out.println("5. Oficiant get " + Pizzeria.pizza.getName() + " pizza from Cook and give it to Client");

                    synchronized (Pizzeria.client) {
                        Pizzeria.client.notify();
                    }
                }

            } catch (InterruptedException e) {

            }
        }
    }
}
