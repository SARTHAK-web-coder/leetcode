class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < m; i++) {
            set2.add(nums2[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int element : set1) {
            if (set2.contains(element)) {
                ans.add(element);
            }
        }
        int[] resultArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            resultArray[i] = ans.get(i);
        }

        return resultArray;
    }
}