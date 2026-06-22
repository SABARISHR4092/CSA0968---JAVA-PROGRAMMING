import java.util.Scanner;
public class ATMBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter " + i + " Denomination: ");
            int denomination = sc.nextInt();
            System.out.print("Enter Number of Notes: ");
            int notes = sc.nextInt();
            total += denomination * notes;
        }
        System.out.println("Total Available Balance in ATM: " + total);
    }
}
