import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gil on 19-Dec-16.
 */

public class Mailer extends Thread {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mailer.class);

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
//                take() with sleep or poll() with null query
//                String line = Bank.queueTransfer.take();
                String line = Bank.queueTransfer.poll(50, TimeUnit.MILLISECONDS);
                if (line != null) {
                    LOGGER.info(line);
                } else throw new InterruptedException();
//                sleep(5);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("All done");
            }
        }
    }
}
