import java.util.*;

public class A21_IntersectionOfArrays {
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

        // Intersection considering frequency (each common element appears
        // min(freq in arr1, freq in arr2) times)
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : arr2) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        if (intersection.isEmpty()) {
            System.out.println("No intersection found.");
        } else {
            System.out.println("Intersection: " + intersection);
        }
    }
}
