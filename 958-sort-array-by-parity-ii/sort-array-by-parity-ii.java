class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 1;
        while (left < n && right < n) {
            if (nums[left] % 2 == 0) {
                left = left + 2;
            } else if (nums[right] % 2 == 1) {
                right = right + 2;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left = left + 2;
                right = right + 2;
            }
        }
        return nums;
    }
}