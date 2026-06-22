import java.util.*;

public class S11_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        // Using split() method
        String[] words = str.split("\\s+");
        System.out.println("Word count (using split): " + words.length);

        // Manual counting without split()
        int count = 0;
        boolean inWord = false;
        for (char c : str.toCharArray()) {
            if (c != ' ' && !inWord) {
                inWord = true;
                count++;
            } else if (c == ' ') {
                inWord = false;
            }
        }
        System.out.println("Word count (manual): " + count);
    }
}
