
public class Account extends Thread {

    int id;
    int balance;
    String name;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.name = "Bank account";
    }

    public synchronized void transferMoney(Account account, Account account2, Integer value) {
                if (account.balance > value) {
                    account2.setBalance(account2.balance + value);
                    account.setBalance(account.balance - value);
                    Bank.queueTransfer.add("Transfer from " + account.id + "(" + account.name + ") to " + account2.id + "(" + account2.name + ") " + value + "$. Balance of " + account.id + ": " + account.balance + ", of " + account2.id + ": " + account2.balance);
//            System.out.println("Transfer from " + account.id + " to " + account2.id + " " + value + "$. Balance of " + account.id + ": " +account.balance + ", of " + account2.id + ": " + account2.balance);
                } else
                    Bank.queueTransfer.add("Not enough money on " + account.id + " to transfer " + value + "$ to " + account2.id);
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
