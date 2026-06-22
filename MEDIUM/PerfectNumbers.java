import java.util.Scanner;
public class PerfectNumbers {
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        System.out.print("First " + n + " Perfect Numbers: ");
        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}