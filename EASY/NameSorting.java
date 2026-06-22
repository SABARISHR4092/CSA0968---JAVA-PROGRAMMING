import java.util.Arrays;
import java.util.Scanner;

public class NameSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter 5 Names:");

        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }

        System.out.print("Order (A/D): ");
        char order = sc.next().charAt(0);

        Arrays.sort(names);

        if (order == 'A' || order == 'a') {

            for (String name : names) {
                System.out.println(name);
            }

        } else if (order == 'D' || order == 'd') {

            for (int i = names.length - 1; i >= 0; i--) {
                System.out.println(names[i]);
            }

        } else {
            System.out.println("Invalid Choice");
        }
    }
}