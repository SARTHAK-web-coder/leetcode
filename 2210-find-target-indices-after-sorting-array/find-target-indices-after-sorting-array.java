class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] count = new int[101];
        for (int x : nums) {
            count[x]++;
        }
        int x = -1;
        for (int i = 1; i <= 100; i++) {
            while (count[i] != 0) {
                nums[++x] = i;
                count[i]--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        return ans;
    }
}