
public class Packman extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
//                synchronized (Pizzeria.packman) {
//                    Pizzeria.packman.wait();

                    Pizza pizza = Pizzeria.queueFromCook.take();

                    Thread.sleep(2000);
                    System.out.println("5. Packman get " + pizza.getName() + " pizza from Cook and give it to Client");
                    Thread.sleep(1000);

                    Pizzeria.queueFromPackman.add(pizza);

//                    synchronized (Pizzeria.client) {
//                        Pizzeria.client.notify();
//                    }
//                }

            } catch (InterruptedException e) {

            }
        }
    }
}


