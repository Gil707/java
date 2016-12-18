public class Client extends Thread {

      String name;
//    List<Client> clientList = new ArrayList<>();
//    String[] arrayOfNames = {"Bob", "Alex", "Nikolay", "Jack", "Petr", "Yana", "Kate", "Nataly"};

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        String strPizza = null;
//        for (int i = 0; i < 20; i++) {
//            clientList.add(new Client(Math.random()))
//        }

        while (true) {
            try {
//            synchronized (Pizzeria.client) {
                sleep(2000);

                Integer i = (int) ((Math.random())*10);

                Pizza pizza = new Pizza(i.toString());

                System.out.println("1. Client " + name + " wents to PIZZERIA 'Where is oficiant??? I want some " + pizza.getName() + "'");

                Pizzeria.queueFromClients.put(pizza);
                System.out.println(".... He add pizza to queueFromClients");

//                synchronized (Pizzeria.oficiant) {
//                    Pizzeria.oficiant.notify();
//                }
//                Pizzeria.client.wait();

                System.out.println("6. Client " + name + " eat own " + Pizzeria.queueFromPackman.take().getName() + " and all goes to bad!");
//                System.exit(0);
//            }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}