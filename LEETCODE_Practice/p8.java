import java.util.HashMap;

public class p8 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0) + 1;// “Get the current count of this number. If it doesn’t exist,
                                                         // assume 0. Then increase it by 1.”
            // Step-by-step meaning:
            // Check if nums[i] is already in the map.
            // If present → get its current frequency.
            // If not present → take 0 as frequency.
            // Add 1 to it.
            // Store result in variable count.
            map.put(nums[i], count);
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

}
// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
