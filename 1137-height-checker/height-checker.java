class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {
            int current = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] < heights[current]) {
                    current = j;
                }
            }
            // swap
            int temp = heights[current];
            heights[current] = heights[i];
            heights[i] = temp;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]!= heights[i]){
                count++;
            }
        }
        return count;

    }
}