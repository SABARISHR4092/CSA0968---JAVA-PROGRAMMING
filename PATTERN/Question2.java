class BankAccount1 {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount1(String accountNumber,
                 String accountHolderName,
                 double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display method
    public void display() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance         : " + balance);
    }
}

// SavingsAccount class
class SavingsAccount1 extends BankAccount1 {

    private double interestRate;

    SavingsAccount1(String accNo,
                   String name,
                   double balance,
                   double interestRate) {

        super(accNo, name, balance);

        this.interestRate = interestRate;
    }

    // Add interest
    public void addInterest() {

        double interest =
                getBalance() * interestRate / 100;

        deposit(interest);

        System.out.println("Interest Added : " + interest);
    }

    // Method overriding (Polymorphism)
    @Override
    public void withdraw(double amount) {

        if (amount <= getBalance() - 500) {
            super.withdraw(amount);
        } else {
            System.out.println(
                    "Minimum balance of 500 required");
        }
    }
}

// CurrentAccount class
class CurrentAccount1 extends BankAccount1 {

    private double overdraftLimit;

    CurrentAccount1(String accNo,
                   String name,
                   double balance,
                   double overdraftLimit) {

        super(accNo, name, balance);

        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    public void withdraw(double amount) {

        if (amount <= getBalance() + overdraftLimit) {

            double remaining =
                    getBalance() - amount;

            System.out.println(
                    "Withdrawn Amount : " + amount);

            System.out.println(
                    "Remaining Balance: " + remaining);

        } else {
            System.out.println(
                    "Overdraft Limit Exceeded");
        }
    }
}

// Main class
public class Question2 {

    public static void main(String[] args) {

        // Savings Account Object
        SavingsAccount1 s1 =
                new SavingsAccount1(
                        "SB101",
                        "Sabarish",
                        5000,
                        5);

        System.out.println(
                "===== Savings Account =====");

        s1.display();

        s1.deposit(1000);

        s1.withdraw(2000);

        s1.addInterest();

        System.out.println();

        CurrentAccount1 c1 =
                new CurrentAccount1(
                        "CA201",
                        "Ramesh",
                        3000,
                        2000);

        System.out.println(
                "===== Current Account =====");

        c1.display();

        c1.deposit(500);

        c1.withdraw(4500);
    }
}