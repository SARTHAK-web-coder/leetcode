class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has appeared once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];

            int needed = prefixSum - k;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;

    }
}