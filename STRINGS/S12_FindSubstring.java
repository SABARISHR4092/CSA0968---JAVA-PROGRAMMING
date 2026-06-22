import java.util.*;
public class S12_FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring to find: ");
        String sub = sc.nextLine();

        // Using indexOf() to check if substring exists
        int index = str.indexOf(sub);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }

        // Using contains()
        System.out.println("Contains substring? " + str.contains(sub));

        // Extracting a substring using substring(start, end)
        System.out.print("\nEnter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {
            System.out.println("Extracted substring: " + str.substring(start, end));
        } else {
            System.out.println("Invalid indices.");
        }
    }
}
