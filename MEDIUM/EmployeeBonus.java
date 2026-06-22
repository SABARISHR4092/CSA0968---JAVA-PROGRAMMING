import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade (A/B): ");
        char grade = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        double bonus = 0;
        if (grade == 'A')
            bonus = salary * 0.05;
        else if (grade == 'B')
            bonus = salary * 0.10;
        else {
            System.out.println("Invalid Grade");
            return;
        }
        if (salary < 10000)
            bonus += salary * 0.02;
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + (salary + bonus));
    }
}