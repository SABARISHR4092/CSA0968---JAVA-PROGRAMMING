import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Decimal Number = " + decimal);
        System.out.println("Octal Number = " + octal);
    }
}