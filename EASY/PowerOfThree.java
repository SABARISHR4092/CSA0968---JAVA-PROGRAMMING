import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println("False");
            return;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        System.out.println(n == 1);
    }
}