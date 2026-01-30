import java.util.*;

public class solution {

    public static int largestElement(int[] nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 2 };

        int largest = largestElement(nums);
        System.out.print(largest);
    }
}

// MY solution
// public class solution {
// public static int largestElement(int[] nums, int idx) {
// if (idx == nums.length - 1) {
// return nums[idx];
// }
// int smor = largestElement(nums, idx + 1);
// if (nums[idx] > smor) {
// return nums[idx];
// } else {
// return smor;
// }

// }

// public static void main(String[] args) {
// int nums[] = { 3, 3, 6, 1 };
// int ans = largestElement(nums, 0);
// System.out.println(ans);

// }

// }
