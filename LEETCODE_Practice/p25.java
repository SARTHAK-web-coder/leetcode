//  starting and ending position of a given target value.
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

import java.util.Arrays;

public class p25 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int ans[] = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = result1(nums, target);
        result[1] = result2(nums, target);
        return result;
    }

    private static int result1(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int i = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
            if (nums[mid] == target) {
                i = mid;
            }
        }
        return i;
    }

    private static int result2(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int i = -1;
        while (h >= l) {
            int mid = l + (h - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
            if (nums[mid] == target) {
                i = mid;
            }
        }
        return i;
    }
}