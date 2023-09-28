package src;

public class Main {
    public static void main(String[] args) {
        double initialBalance = 1000.0;
        System.out.println("Saldo inicial da conta bancária: R$" + initialBalance);

        FinancialTransactionFacade transactionFacade = new FinancialTransactionFacade(
                123456,
                initialBalance,
                789012345,
                2000.0
        );

        transactionFacade.depositToBankAccount(500.0);
        transactionFacade.makePurchaseWithCreditCard(300.0);
        transactionFacade.withdrawFromBankAccount(200.0);

        double bankAccountBalance = transactionFacade.getBankAccountBalance();
        double creditCardBalance = transactionFacade.getCreditCardBalance();

        System.out.println("Saldo da conta bancária: R$" + bankAccountBalance);
        System.out.println("Total gasto no cartão de crédito: R$" + creditCardBalance);
    }
}