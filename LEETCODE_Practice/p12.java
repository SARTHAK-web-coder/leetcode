// Given an integer array nums,
// return the third distinct maximum number in this array. 
// If the third maximum does not exist, return the maximum number.

// Examples :
// Input: nums = [3,2,1]
// Input: nums = [2,1]
// Input: nums = [2,2,1]

// Output: 1
// Output: 2
// Output: 2
// Explanation:

import java.util.Arrays;

public class p12 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3, 4, 2 };
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 3) {
            return nums[n - 1];
        }
        int last = nums[n - 1];
        int distinctCount = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != last) {
                distinctCount++;
                last = nums[i];
            }
            if (distinctCount == 3) {
                return last /* or nums[i] */;
            }
        }
        return nums[n - 1];

    }
}
