import java.util.Scanner;

public class LCMGCD {

    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();
        }

        int gcdResult = arr[0];
        int lcmResult = arr[0];

        for (int i = 1; i < n; i++) {

            gcdResult = gcd(gcdResult, arr[i]);
            lcmResult = lcm(lcmResult, arr[i]);
        }

        System.out.println("GCD = " + gcdResult);
        System.out.println("LCM = " + lcmResult);
    }
}