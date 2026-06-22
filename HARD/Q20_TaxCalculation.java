import java.util.*;

public class Q20_TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = sc.nextDouble();

        if (income < 0) {
            System.out.println("Invalid input. Income cannot be negative.");
            return;
        }

        double tax = 0;
        double taxableIncome = 0;

        // NOTE: The question's sample (income=600000 -> tax=35000) implies a flat
        // 10% on the full taxable amount, but 600000 actually falls in the
        // 5,00,001-10,00,000 slab which the question states is taxed at 20%.
        // This program follows the STATED slab rules below (10%/20%/30% by
        // bracket), since that is the documented rule; the worked sample in
        // the question appears to contain an arithmetic inconsistency.
        if (income <= 250000) {
            tax = 0;
            taxableIncome = 0;
        } else if (income <= 500000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.10;
        } else if (income <= 1000000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.20;
        } else {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.30;
        }

        System.out.println("Taxable Income: " + (int) taxableIncome);
        System.out.println("Tax= " + (int) tax);
    }
}
