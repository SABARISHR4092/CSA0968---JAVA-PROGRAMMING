import java.util.Scanner;

public class SimpleInterest {

    static double calculateInterest(double p, int y, char senior) {

        double rate;

        if (senior == 'y' || senior == 'Y')
            rate = 12;
        else
            rate = 10;

        return (p * y * rate) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Years: ");
        int years = sc.nextInt();

        System.out.print("Senior Citizen (y/n): ");
        char senior = sc.next().charAt(0);

        double interest =
                calculateInterest(principal, years, senior);

        System.out.println("Interest: " + interest);
    }
}