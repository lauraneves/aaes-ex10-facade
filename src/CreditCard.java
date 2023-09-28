package src;

public class CreditCard {
    private int cardNumber;
    private double creditLimit;
    private double balance;

    public CreditCard(int cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    public void makePurchase(double value) {
        if (balance + value <= creditLimit) {
            balance += value;
            System.out.println("Compra feita no valor de R$" + value + " usando o cartão #" + cardNumber);
        } else {
            System.out.println("Cartão de crédito #" + cardNumber + " está sem limite disponível.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
