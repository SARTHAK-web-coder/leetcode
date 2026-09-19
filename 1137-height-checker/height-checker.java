class Solution {
    public int heightChecker(int[] heights) {
        // int[] copy = original.clone();
        int n = heights.length;
        int[] arr = heights.clone();
        for (int i = 0; i < n - 1; i++) {
            int current = i;
            for (int j = i; j < n; j++) {
                if(arr[j]<arr[current]){
                    current = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[current];
            arr[current] = temp;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(heights[i]!=arr[i]){
                count++;
            }
        }
        return count;
    }
}