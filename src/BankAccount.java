package src;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("Depósito recebido no valor de R$" + value + " na conta #" + accountNumber);
    }

    public void withdraw(double value) {
        if (balance >= value) {
            balance -= value;
            System.out.println("Saque no valor de R$" + value + " na conta #" + accountNumber);
        } else {
            System.out.println("Saldo insuficiente conta #" + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }
}
