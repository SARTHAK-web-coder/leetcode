class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<n-1;i++){
            int current = i;
            for(int j=i+1;j<n;j++){
                if(nums[current]>nums[j]){
                    current=j;
                }
            }
            // swap 
            int temp = nums[i];
            nums[i]=nums[current];
            nums[current]=temp;
        }
        return nums;
    }
}