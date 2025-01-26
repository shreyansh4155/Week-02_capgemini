package BankingSystem;

class SavingAccount extends BankAccount implements Loanable {
    private double interestRate = 0.05; // 5% interest rate

    public SavingAccount(long accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application for Savings Account submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Example: Eligible for loan if account balance is greater than 10000
        return balance > 10000;
    }
}