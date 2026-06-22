import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        int[] temp = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {

            temp[j++] = arr[i];

            if (arr[i] == 0 && j < arr.length) {

                temp[j++] = 0;
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}