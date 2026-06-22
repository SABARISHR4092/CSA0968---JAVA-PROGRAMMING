import java.util.*;

public class S9_SortLexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Sort using Arrays.sort (lexicographical order by default)
        Arrays.sort(arr);

        System.out.println("Strings in Lexicographical Order:");
        for (String s : arr) {
            System.out.println(s);
        }

        // Sorting characters of a single string lexicographically
        System.out.print("\nEnter a single string to sort its characters: ");
        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println("Sorted characters: " + new String(chars));
    }
}
