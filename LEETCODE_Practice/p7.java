import java.util.HashMap;

public class p7 {
    public static int searchInsert(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                map.put(nums[high], high);
            }
        }

        return high + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }
}
