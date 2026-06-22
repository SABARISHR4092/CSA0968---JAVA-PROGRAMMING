import java.util.*;
public class S14_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet character.");
            return;
        }
        char lower = Character.toLowerCase(ch);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            System.out.println("'" + ch + "' is a Vowel.");
        } else {
            System.out.println("'" + ch + "' is a Consonant.");
        }
    }
}

