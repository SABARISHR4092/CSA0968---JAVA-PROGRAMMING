import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter Matrix 1:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix 2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}