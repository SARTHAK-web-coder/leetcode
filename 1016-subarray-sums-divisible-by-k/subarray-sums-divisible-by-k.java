class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;

        for (int i = 0; i < n; i++) {
            int need = prefix[i] % k;
            if (need < 0) {
                need = need + k;
            }
            if (map.containsKey(need)) {
                count = count + map.get(need);
            }
            map.put(need, map.getOrDefault(need, 0) + 1);

        }
        return count;
    }
}