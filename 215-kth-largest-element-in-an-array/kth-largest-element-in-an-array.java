class Solution {
    public int findKthLargest(int[] nums, int k) {
        int arr[] = new int[20001];
        for (int val : nums) {
            arr[val + 10000]++;
        }
        int ans = 0;
        for (int i = 20000; i >= 0; i--) {
            while (arr[i] == 0) {
                i--;
            }
            k = k - arr[i];
            if (k <= 0) {
                ans = i - 10000;
                break;
            }
        }
        return ans;
    }
}