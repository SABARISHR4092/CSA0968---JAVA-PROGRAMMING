import java.util.Scanner;

public class CompositeBetween {

    static boolean isComposite(int num) {

        if (num <= 1)
            return false;

        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0)
                count++;
        }

        return count > 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if (isComposite(i))
                System.out.print(i + " ");
        }
    }
}