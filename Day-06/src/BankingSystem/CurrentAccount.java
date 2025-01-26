package BankingSystem;

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(long accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        // Example: No interest on Current Accounts
        return 0.0;
    }
}
