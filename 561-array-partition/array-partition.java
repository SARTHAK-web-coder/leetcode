class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
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