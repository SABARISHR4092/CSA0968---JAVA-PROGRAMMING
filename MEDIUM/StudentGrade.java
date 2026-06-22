import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Python Marks: ");
        int m1 = sc.nextInt();

        System.out.print("C Programming Marks: ");
        int m2 = sc.nextInt();

        System.out.print("Mathematics Marks: ");
        int m3 = sc.nextInt();

        System.out.print("Physics Marks: ");
        int m4 = sc.nextInt();

        int total = m1 + m2 + m3 + m4;

        double aggregate = total / 4.0;

        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate >= 75)
            System.out.println("DISTINCTION");
        else if (aggregate >= 60)
            System.out.println("FIRST DIVISION");
        else if (aggregate >= 50)
            System.out.println("SECOND DIVISION");
        else if (aggregate >= 40)
            System.out.println("THIRD DIVISION");
        else
            System.out.println("FAIL");
    }
}