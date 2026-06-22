import java.util.Scanner;

public class ReadPasswordDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Password Entered Successfully");

        sc.close();
    }
}