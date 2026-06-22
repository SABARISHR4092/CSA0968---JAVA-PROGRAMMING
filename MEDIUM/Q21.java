import java.util.Scanner;
class PrimeCheck implements Runnable {
    int num;
    PrimeCheck(int num) {
        this.num = num;
    }
    public void run() {
        if (num <= 1) {
            System.out.println(num + " is Not Prime");
            return;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}
 class PrimeRunnable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            Thread t = new Thread(new PrimeCheck(num));
            t.start();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}