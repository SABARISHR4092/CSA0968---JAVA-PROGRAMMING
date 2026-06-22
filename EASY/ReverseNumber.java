import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String input = sc.next();

        try {

            int num = Integer.parseInt(input);

            int reverse = 0;

            while (num != 0) {

                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            System.out.println("Reverse Number: " + reverse);

        } catch (Exception e) {

            System.out.println("Invalid Input");
        }
    }
}