import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        while (num > 9) {

            int sum = 0;

            while (num != 0) {

                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        System.out.println("Single Digit Sum = " + num);
    }
}