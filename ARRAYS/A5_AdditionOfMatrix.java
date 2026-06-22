import java.util.*;
public class A5_AdditionOfMatrix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][]mat1 = new int[rows][cols];
        int[][]mat2 = new int[rows][cols];
        int[][]result = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat2[i][j]= sc.nextInt();
            }
        }
        //ADDITION
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("resultant matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
