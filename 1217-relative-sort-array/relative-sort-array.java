class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int freq[] = new int[1001];
        for (int i = 0; i < n; i++) {
            freq[arr1[i]]++;
        }
        int ans[] = new int[n];
        int k = 0;
        for (int val : arr2) {
            while (freq[val] > 0) {
                ans[k++] = val;
                freq[val]--;
            }
        }
        for (int i = 0; i < 1001; i++) {
            while (freq[i] > 0) {
                ans[k++] = i;
                freq[i]--;
            }
        }
        return ans;
    }
}