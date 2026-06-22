import java.util.*;

public class Q8_NumberSquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range:");
        int lower = sc.nextInt();
        System.out.print("Enter the upper range:");
        int upper = sc.nextInt();

        if (lower > upper) {
            System.out.println("Invalid input: lower range cannot be greater than upper range.");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = lower; i <= upper; i++) {
            sb.append("(").append(i).append(", ").append((long) i * i).append(")");
            if (i != upper) sb.append(", ");
        }
        sb.append("]");

        System.out.println(sb.toString());
    }
}
