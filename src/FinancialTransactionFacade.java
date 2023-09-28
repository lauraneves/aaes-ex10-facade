package src;

public class FinancialTransactionFacade {
    private BankAccount bankAccount;
    private CreditCard creditCard;

    public FinancialTransactionFacade(int accountNumber, double initialBalance, int cardNumber, double creditLimit) {
        bankAccount = new BankAccount(accountNumber, initialBalance);
        creditCard = new CreditCard(cardNumber, creditLimit);
    }

    public void makePurchaseWithCreditCard(double value) {
        creditCard.makePurchase(value);
    }

    public void depositToBankAccount(double value) {
        bankAccount.deposit(value);
    }

    public void withdrawFromBankAccount(double value) {
        bankAccount.withdraw(value);
    }

    public double getBankAccountBalance() {
        return bankAccount.getBalance();
    }

    public double getCreditCardBalance() {
        return creditCard.getBalance();
    }
}
