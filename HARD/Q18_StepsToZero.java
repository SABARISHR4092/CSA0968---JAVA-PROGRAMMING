import java.util.*;

public class Q18_StepsToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input: number must be non-negative.");
            return;
        }

        int result = numberOfSteps(n);
        System.out.println("Output: " + result);
    }

    static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
