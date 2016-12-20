
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bank {

    static BlockingQueue<String> queueTransfer = new LinkedBlockingQueue<>();

    static Mailer mailer = new Mailer();

    public static void main(String[] args) throws InterruptedException {

        List<Account> accounts = new ArrayList<>();
        mailer.start();

        for (int i = 0; i < 10; i++) {
            accounts.add(new Account(i,(int)(Math.random() * 500)+100));
        }

        System.out.println("Before transfer: ");

        for (Account thread: accounts) {
            thread.start();
            System.out.println(thread.getName() + " balance is : " + thread.balance);
        }

        System.out.println("\nTransactions: ");

        for (Account thread: accounts) {
            int acc = (int)(Math.random() * 5);
            int acc2 = (int)((Math.random() * 5) + 5);
            int val = (int)(Math.random() * 500);

            thread.transferMoney(accounts.get(acc), accounts.get(acc2), val);
        }
    }
}
