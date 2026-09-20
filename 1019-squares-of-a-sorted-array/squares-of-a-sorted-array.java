class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int left=0;
        int right = n-1;
        int idx = n-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq= nums[right]*nums[right];
            if(rightsq>=leftsq){
                arr[idx--]=rightsq;
                right--;
            }else{
                arr[idx--]=leftsq;
                left++;
            }
        }
        return arr;
    }
}