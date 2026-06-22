import java.util.Scanner;

public class RectangleSymbolPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Symbol: ");
        char symbol = sc.next().charAt(0);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                System.out.print(symbol + " ");
            }

            System.out.println();
        }
    }
}