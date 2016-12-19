
public class Account extends Thread {

    int id;
    int balance;
    int transferred;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public synchronized void transferMoney(Account account, Account account2, Integer value) {
        if (account.balance > value) {
            transferred = value;
            account2.setBalance(balance + value);
            account.setBalance(balance - value);
            System.out.println("Transfer from " + account.id + " to " + account2.id + " " + value + "$. Balance of " + account.id + ": " +account.balance + ", of " + account2.id + ": " + account2.balance);
        } else System.out.println("Not enough money on " + account.id);
    }

    @Override
    public void run() {
        synchronized (Account.class) {

//            synchronized (Bank.mailer) {
//                Bank.mailer.notify();
//            }
        }
    }
}
