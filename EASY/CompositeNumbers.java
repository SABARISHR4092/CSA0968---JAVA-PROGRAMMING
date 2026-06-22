public class CompositeNumbers {
    public static void main(String[] args) {

        int[] arr = {16, 18, 27, 16, 23, 21, 19};

        int compositeCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            int factors = 0;

            if (num > 1) {

                for (int j = 1; j <= num; j++) {

                    if (num % j == 0) {
                        factors++;
                    }
                }

                if (factors > 2) {
                    compositeCount++;
                }
            }
        }

        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
}