class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                c++;
            } else if (nums[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        int idx =0;
        while(c-->0){
            nums[idx]=0;
            idx++;
        }
        while(c1-->0){
            nums[idx]=1;
            idx++;
        }
        while(c2-->0){
            nums[idx]=2;
            idx++;
        }
        System.out.print(Arrays.toString(nums));
    }
}