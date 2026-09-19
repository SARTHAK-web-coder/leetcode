class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List <Integer> set = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int l=0;
        int r=0;
        while(l<n && r<m){
            if(nums1[l]>nums2[r]){
                r++;
            }else if(nums1[l]<nums2[r]){
                l++;
            }
            else{
                set.add(nums1[l]);
                l++;
                r++;
            }
        }
        int arr[]=new int[set.size()];
        int i=0;
        for(int val : set){
            arr[i++]=val;
        }
        return arr;
    }
}