package BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(1234567890, "John Doe", 10000);
        CurrentAccount current = new CurrentAccount(9876544, "Jane Smith", 5000);

        savings.deposit(5000);
        current.withdraw(2000);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());

        if (savings instanceof Loanable) {
            if (((Loanable) savings).calculateLoanEligibility()) {
                ((Loanable) savings).applyForLoan();
            } else {
                System.out.println("Savings Account not eligible for loan.");
            }
        }
    }
}