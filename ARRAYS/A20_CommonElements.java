import java.util.*;

public class A20_CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);

        LinkedHashSet<Integer> common = new LinkedHashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        if (common.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements: " + common);
        }
    }
}
