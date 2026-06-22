import java.util.*;

public class A13_UnionOfSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        // Using two-pointer technique for sorted arrays union
        LinkedHashSet<Integer> union = new LinkedHashSet<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) union.add(arr1[i++]);
        while (j < n2) union.add(arr2[j++]);

        System.out.println("Union of two sorted arrays: " + union);
    }
}
