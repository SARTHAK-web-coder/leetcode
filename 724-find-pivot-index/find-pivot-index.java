class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total = total+nums[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum = total-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}