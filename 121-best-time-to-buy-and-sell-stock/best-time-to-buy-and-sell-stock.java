class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l =0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        while(l<n){
            min = Math.min(min , prices[l]);
            int val = prices[l] - min;
            max = Math.max(max , val);
            l++;
        }
        return max;
    }
}