import java.util.Scanner;

public class SpecialCharacterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Statement:");
        String str = sc.nextLine();

        int count = 0;
        for (char ch : str.toCharArray()) {

            if (!Character.isLetterOrDigit(ch)
                    && !Character.isWhitespace(ch)) {
                count++;
            }
        }

        System.out.println("Number of Special Characters: "
                + count);
    }
}