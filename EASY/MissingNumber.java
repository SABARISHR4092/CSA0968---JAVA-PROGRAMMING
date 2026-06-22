public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {3, 0, 1 ,9};

        int n = nums.length;

        int expected = n * (n + 1) / 2;

        int actual = 0;

        for (int num : nums)
            actual += num;

        System.out.println("Missing Number = "
                + (expected - actual));
    }
}