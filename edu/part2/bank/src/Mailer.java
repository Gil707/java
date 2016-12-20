/**
 * Created by Gil on 19-Dec-16.
 */
public class Mailer extends Thread {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                String line = Bank.queueTransfer.take();
                System.out.println(line);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("All done");
            }
        }
    }
}
