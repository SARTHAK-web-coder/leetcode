class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;

        // Find the minimum possible capacity
        // and the maximum possible capacity
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        int ans = 0;
        int left = maxWeight;
        int right = totalWeight;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum =0;
            int reqdays = 1;
            for(int weight : weights){
                if((sum+weight<=mid)){
                    sum = sum + weight;
                }else{
                    reqdays++;
                    sum = weight;
                }
            }
            if(reqdays<=days){
                right=mid;
            }else if(reqdays>days){
                left=mid+1;
            }
        }
        return left;
        // for(int i=maxWeight;i<=totalWeight;i++){
        //     int sum = 0;
        //     int reqdays = 1;
        //     for(int idx : weights){
        //         if(sum + idx <= i){
        //             sum = sum + idx;
        //         }else{
        //             reqdays++;
        //             sum = idx;
        //         }
        //     }
        //     if(reqdays<=days){
        //         ans = i;
        //         break;
        //     }
        // }
        // return ans;

    }
}