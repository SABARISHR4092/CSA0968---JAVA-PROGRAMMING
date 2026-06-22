import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        for (int i = m; i <= n; i += (k + 1)) {

            System.out.print(i + " ");
        }
    }
}