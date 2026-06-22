import java.util.*;

public class Q17_KWeakestRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements (0s and 1s):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = kWeakestRows(mat, k);
        System.out.println("Output: " + Arrays.toString(result));
    }

    static int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int[][] soldierCount = new int[rows][2]; // [count, index]

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int val : mat[i]) {
                if (val == 1) count++;
            }
            soldierCount[i][0] = count;
            soldierCount[i][1] = i;
        }

        Arrays.sort(soldierCount, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldierCount[i][1];
        }

        return result;
    }
}
