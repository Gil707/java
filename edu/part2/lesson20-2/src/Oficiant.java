public class Oficiant extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
//                synchronized (Pizzeria.oficiant) {
//                    Pizzeria.oficiant.wait();

                    Pizza pizza = Pizzeria.queueFromClients.take();

                    Thread.sleep(2000);
                    System.out.println("2. Oficiant wake up and get the order. Pizza = " + pizza.getName() + " added to queueFromClients, waking the Cook...");
                    Thread.sleep(2000);

                    Pizzeria.queueFromOficiant.add(pizza);
//
//                    synchronized (Pizzeria.cook) {
//                        Pizzeria.cook.notify();
//                    }
//                }
            } catch (InterruptedException e) {

            }
        }
    }
}
