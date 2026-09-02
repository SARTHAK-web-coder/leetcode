class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int leftSqu = nums[left] * nums[left];
            int rightSqu = nums[right] * nums[right];
            // comparing squares of left & right element , because they or non-decreasing order , so automatically get high square no.
            if (leftSqu > rightSqu) {
                arr[i] = leftSqu;
                left++;
            } else {
                arr[i] = rightSqu;
                right--;
            }
        }
        return arr;
    }
}