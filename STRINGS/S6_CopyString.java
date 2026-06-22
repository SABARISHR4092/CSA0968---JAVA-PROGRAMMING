import java.util.*;

public class S6_CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Method 1: Direct assignment (reference copy)
        String copy1 = original;
        System.out.println("Copy using assignment: " + copy1);

        // Method 2: Using new keyword (creates a new object)
        String copy2 = new String(original);
        System.out.println("Copy using new String(): " + copy2);

        // Method 3: Character by character copy into char array
        char[] charArray = new char[original.length()];
        for (int i = 0; i < original.length(); i++) {
            charArray[i] = original.charAt(i);
        }
        String copy3 = new String(charArray);
        System.out.println("Copy using char array: " + copy3);

        // Method 4: Using toCharArray() and String constructor
        String copy4 = String.valueOf(original.toCharArray());
        System.out.println("Copy using toCharArray(): " + copy4);
    }
}
