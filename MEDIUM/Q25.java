import java.util.Scanner;
 class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");

        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        String replaced =
                str.replace("Saveetha", "SIMATS");

        System.out.println("After Replace: "
                + replaced);

        System.out.println("Length = "
                + str.length());

        System.out.println("Uppercase = "
                + str.toUpperCase());
    }
}