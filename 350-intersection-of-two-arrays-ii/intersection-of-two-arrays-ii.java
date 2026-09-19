class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            int count = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], count);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int idx = 0;
        int ans[] = new int[list.size()];
        for (int val : list) {
            ans[idx++] = val;
        }
        return ans;
    }
}