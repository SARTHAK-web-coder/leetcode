// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                arr[1] = i;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (target == nums[i]) {
                arr[0] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int result[] = searchRange(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}