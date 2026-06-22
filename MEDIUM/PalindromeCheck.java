import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. String Palindrome");
        System.out.println("2. Number Palindrome");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice) {
            case 1:
                System.out.print("Enter String: ");
                String str = sc.nextLine();
                String rev = new StringBuilder(str).reverse().toString();
                if(str.equalsIgnoreCase(rev))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;
            case 2:
                System.out.print("Enter Number: ");
                int num = sc.nextInt();
                int temp = num;
                int revNum = 0;
                while(temp > 0) {
                    revNum = revNum * 10 + temp % 10;
                    temp /= 10;
                }

                if(num == revNum)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}