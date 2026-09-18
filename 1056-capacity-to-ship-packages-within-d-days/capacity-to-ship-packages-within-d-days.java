class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;
        for (int val : weights) {
            maxWeight = Math.max(maxWeight, val);
            totalWeight += val;
        }
        int left = maxWeight;
        int right = totalWeight;
        int ans = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            int reqdays = 1;
            for (int weight : weights) {
                if ((sum + weight) <= mid) {
                    sum += weight;
                } else {
                    reqdays++;
                    sum = weight;
                }
            }
            if (reqdays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}