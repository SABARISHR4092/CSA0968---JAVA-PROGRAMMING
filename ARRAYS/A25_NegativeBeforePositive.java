import java.util.*;

public class A25_NegativeBeforePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (can include negatives):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer partition technique - O(n) time, O(1) space
        int left = 0, right = n - 1;

        while (left < right) {
            // Move left pointer until a positive number is found
            while (left < right && arr[left] < 0) {
                left++;
            }
            // Move right pointer until a negative number is found
            while (left < right && arr[right] >= 0) {
                right--;
            }
            // Swap positive (at left) with negative (at right)
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Array with negative elements before positive elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
