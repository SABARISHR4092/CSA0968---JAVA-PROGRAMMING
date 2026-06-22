import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0;
        int lower = 0;
        int digits = 0;
        char ch;
        System.out.println("Enter * to Exit");
        while (true) {
            System.out.print("Enter Character: ");
            ch = sc.next().charAt(0);
            if (ch == '*')
                break;
            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digits++;
        }
        System.out.println("Total count of lower case: " + lower);
        System.out.println("Total count of upper case: " + upper);
        System.out.println("Total count of numbers: " + digits);
    }
}