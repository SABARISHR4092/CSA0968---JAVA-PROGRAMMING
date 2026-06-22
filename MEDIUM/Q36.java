import java.math.BigInteger;
import java.util.Scanner;
 class StringMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        String num1 = sc.next();
        System.out.print("Enter Number 2: ");
        String num2 = sc.next();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        System.out.println("Product = " + result);
    }
}