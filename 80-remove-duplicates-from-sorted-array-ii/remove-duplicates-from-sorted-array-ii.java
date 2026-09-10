class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        int k = 2;
        int n = nums.length;
        while (i < n) {
            // if <=2 nums[element]present not affect array 
            // but >2 nums[element] present then it (nums[k])change to next the nums[element]
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}