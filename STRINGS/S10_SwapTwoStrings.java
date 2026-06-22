import java.util.*;

public class S10_SwapTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\nBefore Swap:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swap using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("\nAfter Swap:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
