import java.util.*;

public class Q15_RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine().trim().toUpperCase();

        if (!s.matches("[IVXLCDM]+")) {
            System.out.println("Invalid input: contains characters that are not valid Roman numerals.");
            return;
        }

        int result = romanToInt(s);
        System.out.println("Output: " + result);
    }

    static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = values.get(s.charAt(i));

            if (i + 1 < n && current < values.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }
}
