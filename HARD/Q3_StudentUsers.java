import java.util.*;

public class Q3_StudentUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Users: ");
        int totalUsers = sc.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = sc.nextInt();

        if (totalUsers <= 0) {
            System.out.println("Invalid input: Total users must be positive.");
            return;
        }
        if (staffUsers < 0 || staffUsers > totalUsers) {
            System.out.println("Invalid input: Staff users cannot be negative or exceed total users.");
            return;
        }

        // For every 3 staff users, there's 1 non-teaching staff user by default
        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaff;

        if (studentUsers < 0) {
            System.out.println("Invalid input: Staff + Non-teaching staff exceeds Total users.");
            return;
        }

        System.out.println("Student Users: " + studentUsers);
    }
}
