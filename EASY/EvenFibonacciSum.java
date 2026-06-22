import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        int limit = 2 * n;

        int a = 0, b = 1;

        int sum = 0;

        for (int i = 0; i <= limit; i++) {

            if (i % 2 == 0)
                sum += a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Sum = " + sum);
    }
}