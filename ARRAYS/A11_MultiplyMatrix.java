import java.util.*;
public class A11_MultiplyMatrix {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and colums of first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter rows and columns of second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1!=r2){
            System.out.println("MAtrix multiplication could not be possible");
            return;
        }
        int [][]mat1 = new int[r1][c1];
        int [][]mat2 = new int[r2][c2];
        int [][]result = new int[r1][c2];
        System.out.println("enter the elements of first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements for second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum = 0;
                for(int k=0;k<c1;k++){
                    sum+=mat1[i][k] * mat2[k][j];
                }
                result[i][j]=sum;
            }
        }
        System.out.println("resultant matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}