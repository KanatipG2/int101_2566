package work04;

public class BankAccount {
    private int number;
    private Person owner;

    private double balance = 0.00;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    public void transfer(double amount,BankAccount account) {
        this.balance -= amount;
        account.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount(" + owner.getId() + ",)";
    }
}
