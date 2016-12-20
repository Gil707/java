import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Gil on 19-Dec-16.
 */

public class Mailer extends Thread {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mailer.class);

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                String line = Bank.queueTransfer.take();
                LOGGER.info(line);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("All done");
            }
        }
    }
}
