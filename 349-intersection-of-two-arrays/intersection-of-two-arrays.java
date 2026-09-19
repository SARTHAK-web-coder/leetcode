class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(nums1[i]);
        }
        for (int element : nums2) {
            if (set1.contains(element)) {
                set2.add(element);
            }
        }
        int[] resultArray = new int[set2.size()];
        int i=0;
        for(int val : set2){
            resultArray[i++]=val;
        }
        
        return resultArray;
    }
}