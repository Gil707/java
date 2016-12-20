
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bank {

    private static boolean flag = false;

    public static boolean isFlag() {
        return flag;
    }

    static synchronized void transferMoney(Account account, Account account2, Integer value) {
                if (account.balance > value) {
                    account2.setBalance(account2.balance + value);
                    account.setBalance(account.balance - value);
                    Bank.queueTransfer.add(Thread.currentThread().getName() + " making transfer from " + account.id + "(" + account.name + ") to " + account2.id + "(" + account2.name + ") = " + value + "$. Balance of " + account.id + ": " + account.balance + "$, of " + account2.id + ": " + account2.balance + "$");
                } else
                    Bank.queueTransfer.add(Thread.currentThread().getName() + " cannot transfer, not enough money on " + account.id + " to transfer " + value + "$ to " + account2.id);
    }

    static BlockingQueue<String> queueTransfer = new LinkedBlockingQueue<>();

    static Mailer mailer = new Mailer();

    public static void main(String[] args) throws InterruptedException {

        List<Account> accounts = new ArrayList<>();

        System.out.println("Before transfer: ");

        for (int i = 0; i < 10; i++) {
            accounts.add(new Account(i,(int)(Math.random() * 1000)+500));
            System.out.println(accounts.get(i).toString());
        }

        mailer.start();

        System.out.println("\nTransactions: ");

        for (int i = 0; i < 1000; i++) {
            int acc = (int)(Math.random() * 5);
            int acc2 = (int)((Math.random() * 5) + 5);
            int val = (int)(Math.random() * 500);
            new Thread(() -> Bank.transferMoney(accounts.get(acc), accounts.get(acc2), val)).start();
        }
    }
}
