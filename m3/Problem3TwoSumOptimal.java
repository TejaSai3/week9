import java.util.HashSet;
import java.util.Set;

public class Problem3TwoSumOptimal {

    /**
     * Checks if there exists a pair of numbers in the array that sum to the target.
     * Uses a HashSet for O(n) time efficiency.
     * 
     * @param nums   Unsorted array of integers
     * @param target Desired sum
     * @return true if a pair exists, false otherwise
     */
    public static boolean hasPairWithSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, -2, 9};
        int target = 5;

        boolean result = hasPairWithSum(nums, target);
        System.out.println("Pair exists: " + result); // Output: true (4 + 1 = 5)
    }
}