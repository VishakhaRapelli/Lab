package Abstraction;
interface BankAccount1 {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount1 implements BankAccount1 {
    private int accountNumber;
    private double balance;

    public CheckingAccount1(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " dollars.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " dollars.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class Question3 {
	public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);
    }

}
