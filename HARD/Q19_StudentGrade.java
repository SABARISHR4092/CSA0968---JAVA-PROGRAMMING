import java.util.*;

public class Q19_StudentGrade {

    // Java doesn't support multiple inheritance of classes, so we simulate it
    // using multiple interfaces, which a single class can implement.
    interface Marks {
        int getTotal(int[] marks);
    }

    interface Result {
        double getAggregate(int total, int subjects);
        String getGrade(double aggregate);
    }

    static class StudentGradeCalculator implements Marks, Result {
        public int getTotal(int[] marks) {
            int total = 0;
            for (int m : marks) total += m;
            return total;
        }

        public double getAggregate(int total, int subjects) {
            return (double) total / subjects;
        }

        public String getGrade(double aggregate) {
            if (aggregate > 75) return "DISTINCTION";
            else if (aggregate >= 60) return "FIRST DIVISION";
            else if (aggregate >= 50) return "SECOND DIVISION";
            else if (aggregate >= 40) return "THIRD DIVISION";
            else return "FAIL";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"python", "c programming", "Mathematics", "Physics", "Chemistry", "Professional Ethics"};
        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks for " + subjects[i] + ". Must be between 0 and 100.");
                return;
            }
        }

        StudentGradeCalculator calc = new StudentGradeCalculator();
        int total = calc.getTotal(marks);
        double aggregate = calc.getAggregate(total, marks.length);
        String grade = calc.getGrade(aggregate);

        System.out.println("Total= " + total);
        System.out.printf("Aggregate = %.2f%n", aggregate);
        System.out.println("Class: " + grade);
    }
}
