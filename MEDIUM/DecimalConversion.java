import java.util.Scanner;
public class DecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        System.out.println("Binary Number = " + binary);
        System.out.println("Octal Number = " + octal);
    }
}
