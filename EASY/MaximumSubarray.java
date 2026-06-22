public class MaximumSubarray {
    public static void main(String[] args) {

        int[] nums =
                {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = nums[0];

        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {

            current = Math.max(nums[i],
                    current + nums[i]);

            maxSum = Math.max(maxSum, current);
        }

        System.out.println("Maximum Sum = "
                + maxSum);
    }
}