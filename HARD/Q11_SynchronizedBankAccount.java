import java.util.*;

class Customer {
    private String accountNo;
    private String accName;
    private double balance;

    public Customer(String accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        System.out.println("Withdraw requested: " + amount);
        while (amount > balance) {
            System.out.println("Insufficient balance (" + balance + "). Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount " + balance);
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Balance now: " + balance);
        notifyAll();
    }
}

public class Q11_SynchronizedBankAccount {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Existing bank balance amount = 10000 as per problem statement
        final Customer customer = new Customer("ACC001", "Customer1", 10000);

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        Thread withdrawThread = new Thread(() -> customer.withdraw(withdrawAmount));
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(1500); // simulate delay before deposit arrives
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            customer.deposit(depositAmount);
        });

        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();
    }
}
