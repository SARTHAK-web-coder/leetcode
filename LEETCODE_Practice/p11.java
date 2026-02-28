// Example 1:
// Input: nums = [3,0,1]
// Output: 2

// Explanation:
// n = 3 since there are 3 numbers, 
// so all numbers are in the range [0,3]. 
// 2 is the missing number in the range since it does not appear in nums.

// Example 2:
// Input: nums = [0,1]
// Output: 2
// Explanation:
// n = 2 since there are 2 numbers, 
// so all numbers are in the range [0,2].
// 2 is the missing number in the range since it does not appear in nums.

public class p11 {
    public static void main(String[] args) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int sum2 = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return sum2 - sum;
    }

}