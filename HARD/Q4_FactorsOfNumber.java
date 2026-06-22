import java.util.*;

public class Q4_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        int num = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input: number must be positive.");
            return;
        }
        if (n <= 0) {
            System.out.println("Invalid input: N must be positive.");
            return;
        }

        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Number of factors = " + factors.size());

        if (n > factors.size()) {
            System.out.println("N exceeds number of factors available.");
        } else {
            System.out.println(n + "th factor of " + num + " = " + factors.get(n - 1));
        }
    }
}
