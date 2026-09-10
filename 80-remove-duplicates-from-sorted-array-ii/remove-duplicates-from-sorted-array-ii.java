class Solution {
    public int removeDuplicates(int[] nums) {
        int i =2;
        int k=2;
        int n = nums.length;
        while(i<n){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}