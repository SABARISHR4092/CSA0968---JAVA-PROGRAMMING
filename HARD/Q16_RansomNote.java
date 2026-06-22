import java.util.*;

public class Q16_RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ransomNote: ");
        String ransomNote = sc.nextLine();
        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Output: " + result);
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for (char c : magazine.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCount[c - 'a']++;
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (c < 'a' || c > 'z') {
                return false;
            }
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
