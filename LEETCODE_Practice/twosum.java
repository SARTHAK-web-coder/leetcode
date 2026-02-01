import java.util.HashMap;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int Re = target - nums[i];// Re = remaining element
            if (map.containsKey(Re)) {
                return new int[] { map.get(Re), i };// map.get(Re) gives the index of the number
            }
            map.put(nums[i], i);// put nums[i]=2 at index i==0(which is equal to) get from map.get(re).
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 22;

        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

    }

}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
