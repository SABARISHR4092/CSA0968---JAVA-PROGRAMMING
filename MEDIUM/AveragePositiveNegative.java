import java.util.Scanner;
public class AveragePositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int posCount = 0, negCount = 0;
        int posSum = 0, negSum = 0;
        System.out.println("Enter -1 to Exit");
        while (true) {
            System.out.print("Enter Number: ");
            num = sc.nextInt();
            if (num == -1)
                break;
            if (num > 0) {
                posSum += num;
                posCount++;
            }
            else if (num < 0) {
                negSum += num;
                negCount++;
            }
        }
        if (negCount > 0)
            System.out.println("Average of Negative Numbers = "
                    + (double) negSum / negCount);
        if (posCount > 0)
            System.out.println("Average of Positive Numbers = "
                    + (double) posSum / posCount);
    }
}