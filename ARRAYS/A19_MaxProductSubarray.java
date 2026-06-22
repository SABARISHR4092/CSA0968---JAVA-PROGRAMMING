import java.util.*;

public class A19_MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Dynamic programming approach - tracks both max and min ending here
        // (min is needed because a negative * negative can become the new max)
        long maxEndingHere = arr[0];
        long minEndingHere = arr[0];
        long maxProduct = arr[0];

        int startIndex = 0, endIndex = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {
            long current = arr[i];

            if (current < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            if (current > maxEndingHere * current) {
                tempStart = i;
                maxEndingHere = current;
            } else {
                maxEndingHere = maxEndingHere * current;
            }

            minEndingHere = Math.min(current, minEndingHere * current);

            if (maxEndingHere > maxProduct) {
                maxProduct = maxEndingHere;
                startIndex = tempStart;
                endIndex = i;
            }
        }

        System.out.println("Maximum product subarray value: " + maxProduct);
        System.out.print("Subarray: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
