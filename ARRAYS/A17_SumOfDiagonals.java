import java.util.*;

public class A17_SumOfDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][n - 1 - i];
        }
        System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }
}
