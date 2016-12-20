
public class Account {

    int id;
    volatile int balance;
    String name;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account #" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance + "$ ";
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.name = "Bank account";
    }

}
