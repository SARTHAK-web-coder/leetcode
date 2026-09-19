class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        while (i < n - 1) {
            int min = Math.min(nums[i], nums[i + 1]);
            sum = sum + min;
            i = i + 2;
        }
        return sum;
    }
}