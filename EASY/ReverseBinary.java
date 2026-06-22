import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        String reverse = "";

        for (int i = binary.length() - 1; i >= 0; i--) {
            reverse += binary.charAt(i);
        }

        int decimal = Integer.parseInt(reverse, 2);

        System.out.println("Output: " + decimal);
    }
}