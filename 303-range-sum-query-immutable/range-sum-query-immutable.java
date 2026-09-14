class NumArray {
    private int prefSum[];

    public NumArray(int[] nums) {
        int n = nums.length;
        prefSum = new int[n + 1];
        int m = n + 1;
        prefSum[0] = 0;
        prefSum[1] = nums[0];
        for (int i = 2; i < m; i++) {
            prefSum[i] = nums[i - 1] + prefSum[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        int ans = prefSum[right + 1] - prefSum[left];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */