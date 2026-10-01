class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        // if I subtract subarray (sum <= goal) ans (sum <= goal-1) 
        // then i get subarray sum == gaol. it is simple Maths.
        int ans = atMost(nums, goal) - atMost(nums, goal - 1);
        return ans;
    }

    public static int atMost(int[] nums, int goal) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right < n) {
            sum = sum + nums[right];

            while (sum > goal && left <= right) {
                sum = sum - nums[left];
                left++;
            }

            count = count + (right - left + 1);

            right++;
        }
        return count;
    }
}