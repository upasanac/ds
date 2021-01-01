package ds.arrays;

/**
 * 487 Max Consecutive Ones II
 * Problem:
 * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
 *
 * Example 1:
 *
 * Input: [1,0,1,1,0]
 * Output: 4
 * Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 *     After flipping, the maximum number of consecutive 1s is 4.
 */
public class MaxConsecutiveOnes2 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int current = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            count++;

            if (nums[i] == 0) {
                current = count;
                count = 0;
            }

            max = Math.max(max, count+current);
        }
        return max;
    }

    public static void main(String args[]) {
        MaxConsecutiveOnes2 maxConsecutiveOnes2 = new MaxConsecutiveOnes2();
        int [] input = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1};
        int result = maxConsecutiveOnes2.findMaxConsecutiveOnes(input);
        System.out.println("Max consecutive ones =" + result);
    }
}
