import java.util.*;

public class Q6_PerfectSquaresDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        if (lower > upper) {
            System.out.println("Invalid input: lower range cannot be greater than upper range.");
            return;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt) && i >= 0) {
                if (digitSum(i) < 10) {
                    result.add(i);
                }
            }
        }

        System.out.println(result.toString());
    }

    static int digitSum(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
