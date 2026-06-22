import java.util.*;

public class A14_LargestSmallestMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        int max = mat[0][0], min = mat[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] > max) max = mat[i][j];
                if (mat[i][j] < min) min = mat[i][j];
            }
        }

        System.out.println("Largest element in matrix: " + max);
        System.out.println("Smallest element in matrix: " + min);
    }
}
