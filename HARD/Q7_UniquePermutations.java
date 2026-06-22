import java.util.*;

public class Q7_UniquePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        String input = sc.nextLine().trim();

        boolean negative = input.startsWith("-");
        String digits = negative ? input.substring(1) : input;

        if (digits.isEmpty() || !digits.chars().allMatch(Character::isDigit)) {
            System.out.println("Invalid input: please enter a valid integer.");
            return;
        }

        TreeSet<String> permutations = new TreeSet<>();
        boolean[] used = new boolean[digits.length()];
        permute(digits.toCharArray(), used, new StringBuilder(), permutations);

        System.out.println("Permutations are:");
        for (String p : permutations) {
            System.out.println((negative ? "-" : "") + p);
        }
    }

    static void permute(char[] digits, boolean[] used, StringBuilder current, TreeSet<String> result) {
        if (current.length() == digits.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.append(digits[i]);
            permute(digits, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
