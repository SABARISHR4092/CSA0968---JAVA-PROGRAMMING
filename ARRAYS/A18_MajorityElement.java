import java.util.*;

public class A18_MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Boyer-Moore Voting Algorithm - O(n) time, O(1) space
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        // Verify the candidate appears more than n/2 times
        int actualCount = 0;
        for (int num : arr) {
            if (num == candidate) actualCount++;
        }

        if (actualCount > n / 2) {
            System.out.println("Majority element: " + candidate + " (appears " + actualCount + " times)");
        } else {
            System.out.println("No majority element exists.");
        }
    }
}
