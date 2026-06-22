class Customer {

    int amount = 15000;

    synchronized void withdraw(int amount) {

        System.out.println("Going to withdraw...");

        if (this.amount < amount) {

            System.out.println("Less balance; waiting for deposit...");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.amount -= amount;

        System.out.println("Withdraw completed...");
        System.out.println("Remaining Balance: " + this.amount);
    }

    synchronized void deposit(int amount) {

        System.out.println("Going to deposit...");

        this.amount += amount;

        System.out.println("Deposit completed...");
        System.out.println("Current Balance: " + this.amount);

        notify();
    }
}

class TestIC {

    public static void main(String[] args) {

        final Customer c = new Customer();

        Thread t1 = new Thread() {
            public void run() {
                c.withdraw(20000);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                c.deposit(10000);
            }
        };

        t1.start();
        t2.start();
    }
}