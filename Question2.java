package Abstraction;
abstract class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars.");
    }
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " dollars.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

public class Question2 {
	public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }

}
