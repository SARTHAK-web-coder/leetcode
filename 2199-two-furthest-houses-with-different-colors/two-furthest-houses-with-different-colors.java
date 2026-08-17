class Solution {
    public int maxDistance(int[] colors) {
        int r = colors.length-1;
        while(colors[r]==colors[0] && r>=0){
            r--;
        }
        int l =0;
        int n = colors.length;
        while(colors[l]==colors[n-1] && l<n){
            l++;
        }
        int max = Math.max(r,n-l-1);
        return max;
    }
}