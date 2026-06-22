import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        double root = Math.sqrt(num);

        if (root == (int) root) {

            System.out.println("Square Root: "
                    + (int) root + ", -" + (int) root);

        } else {

            System.out.println("Not Perfect Square");
        }
    }
}