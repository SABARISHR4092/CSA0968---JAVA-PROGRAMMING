import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to be searched: ");
        char search = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == search) {

                System.out.println(search +
                        " is found in string at index: " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Character not found in string");
        }
    }
}