package String;
abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        double newBalance = getBalance() + amount;
        System.out.println("Deposited amount: " + amount);
        System.out.println("New balance: " + newBalance);
    }

    @Override
    void withdraw(double amount) {
        double newBalance = getBalance() - amount;
        System.out.println("Withdrawn amount: " + amount);
        System.out.println("New balance: " + newBalance);
    }
}
public class Eg4 {
	public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(12345, 1000);

        checkingAccount.deposit(500);
        checkingAccount.withdraw(200);
    }
}
