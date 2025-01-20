import java.util.Scanner;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = scanner.nextLong();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);

        System.out.println("\nAccount Created Successfully!");
        account.displayBalance();

        // User Interactions
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}