import java.util.Arrays;

public class MeanMedianMode {
    public static void main(String[] args) {
        double[] arr = {16, 18, 27, 16, 23, 21, 19};
        // Mean
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = sum / arr.length;

        // Median
        Arrays.sort(arr);
        double median;
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] +
                    arr[(arr.length / 2) - 1]) / 2;

        }
        else {

            median = arr[arr.length / 2];
        }

        // Mode
        double mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {

                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}