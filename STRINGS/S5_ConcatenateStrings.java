import java.util.*;

public class S5_ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Using concat() method
        String result1 = str1.concat(str2);
        System.out.println("Concatenated using concat(): " + result1);

        // Using + operator
        String result2 = str1 + str2;
        System.out.println("Concatenated using + operator: " + result2);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);
        System.out.println("Concatenated using StringBuilder: " + sb.toString());
    }
}
