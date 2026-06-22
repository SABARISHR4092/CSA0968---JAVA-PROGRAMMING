import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>();

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Non-Duplicate Items:");
        System.out.println(set);
    }
}
