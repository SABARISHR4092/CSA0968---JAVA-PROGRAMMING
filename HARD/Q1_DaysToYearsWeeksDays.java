import java.util.*;

public class Q1_DaysToYearsWeeksDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        String input = sc.nextLine().trim();

        try {
            int days = Integer.parseInt(input);

            if (days < 0) {
                System.out.println("Invalid input: number of days cannot be negative.");
                return;
            }

            int years = days / 365;
            int remainingAfterYears = days % 365;
            int weeks = remainingAfterYears / 7;
            int remainingDays = remainingAfterYears % 7;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + remainingDays);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter a valid integer number of days.");
        }
    }
}
