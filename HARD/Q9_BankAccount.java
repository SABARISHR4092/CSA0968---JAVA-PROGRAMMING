import java.util.*;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private char accountType; // 'S' for Savings, 'C' for Current
    private double balance;
    private static final double MIN_BALANCE = 500.00;

    public void readAccountDetails(int accNo, String name, char type, double initialBalance) {
        this.accountNumber = accNo;
        this.depositorName = name;
        this.accountType = type;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of Rs.500.00 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + (accountType == 'S' ? "Savings" : "Current"));
        System.out.println("Balance: " + balance);
    }
}

public class Q9_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Depositor Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Type (S/C): ");
        char type = sc.nextLine().trim().toUpperCase().charAt(0);

        if (type != 'S' && type != 'C') {
            System.out.println("Invalid account type. Must be S (Savings) or C (Current).");
            return;
        }

        // Assume balance amount = 10000 as per problem statement
        double initialBalance = 10000;

        BankAccount account = new BankAccount();
        account.readAccountDetails(accNo, name, type, initialBalance);
        account.displayBalance();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();
    }
}
