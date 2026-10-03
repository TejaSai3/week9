public class Problem4TwoSumBruteForce {

    /**
     * Checks if there exists a pair of numbers in the array that sum to the target.
     * Uses a brute-force approach checking all pairs.
     * 
     * @param nums   Unsorted array of integers
     * @param target Desired sum
     * @return true if a pair exists, false otherwise
     */
    public static boolean hasPairWithSumBruteForce(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, -2, 9};
        int target = 5;

        boolean result = hasPairWithSumBruteForce(nums, target);
        System.out.println("Pair exists: " + result); // Output: true
    }
}