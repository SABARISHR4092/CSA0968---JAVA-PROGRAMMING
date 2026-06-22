import java.util.*;
 class MthMaxNthMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14,16,87,36,25,89,34};
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        Arrays.sort(arr);
        int nthMin = arr[N - 1];
        int mthMax = arr[arr.length - M];
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + (mthMax + nthMin));
        System.out.println("Difference = " + (mthMax - nthMin));
    }
}
