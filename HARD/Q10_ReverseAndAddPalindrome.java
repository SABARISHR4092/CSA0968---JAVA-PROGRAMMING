import java.util.*;
import java.math.BigInteger;

public class Q10_ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine().trim();

        boolean negative = input.startsWith("-");
        String numStr = negative ? input.substring(1) : input;

        if (numStr.isEmpty() || !numStr.chars().allMatch(Character::isDigit)) {
            System.out.println("Invalid input: please enter a valid integer.");
            return;
        }

        if (negative) {
            System.out.println("Invalid input: negative numbers are not supported for this operation.");
            return;
        }

        BigInteger num = new BigInteger(numStr);

        if (num.equals(BigInteger.ZERO)) {
            System.out.println("0 is already a palindrome.");
            return;
        }

        int maxIterations = 1000; // safety limit
        int iterations = 0;

        while (!isPalindrome(num.toString()) && iterations < maxIterations) {
            BigInteger reversed = new BigInteger(new StringBuilder(num.toString()).reverse().toString());
            BigInteger sum = num.add(reversed);
            System.out.println(num + " + " + reversed + " = " + sum);
            num = sum;
            iterations++;
        }

        if (isPalindrome(num.toString())) {
            System.out.println(num + " (Palindrome)");
        } else {
            System.out.println("No palindrome found within " + maxIterations + " iterations.");
        }
    }

    static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
