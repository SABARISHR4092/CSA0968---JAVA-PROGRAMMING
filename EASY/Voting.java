import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.println("Eligible for Vote");

        } else if (age > 0) {

            System.out.println("You are allowed to vote after "
                    + (18 - age) + " years");

        } else {

            System.out.println("Invalid Age");
        }
    }
}