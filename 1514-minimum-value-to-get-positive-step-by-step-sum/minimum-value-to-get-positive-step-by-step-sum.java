class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min ,arr[i]);
        }
        int ans = 0;
        if (min <= 0) {
            ans = Math.abs(min) + 1;
        } else {
            ans = 1;
        }
        return ans;
    }
}