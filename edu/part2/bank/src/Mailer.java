/**
 * Created by Gil on 19-Dec-16.
 */
public class Mailer extends Thread {

    public Mailer() {

    }

    @Override
    public void run() {
        try {
            synchronized (Bank.mailer) {
                Bank.mailer.wait();
                System.out.println("mailer");

                Bank.mailer.wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
