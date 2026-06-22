import java.util.*;

public class Q13_CommonElements {
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

        List<Integer> common = findCommon(arr1, arr2);
        System.out.println("Expected output: " + common.toString());
    }

    static List<Integer> findCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        return new ArrayList<>(result);
    }
}
