import java.util.*;

public class A9_InsertAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert (0-based index): ");
        int pos = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }

        int[] newArr = new int[n + 1];

        // Copy elements before the position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert new value
        newArr[pos] = value;

        // Copy remaining elements after the position
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
