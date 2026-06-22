import java.util.*;
public class NthLargest {
    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        Arrays.sort(arr);
        if (n > arr.length || n <= 0)
            System.out.println("Invalid N");
        else
            System.out.println(n + "th Largest Number = " + arr[arr.length - n]);
    }
}