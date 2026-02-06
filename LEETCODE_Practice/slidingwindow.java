public class slidingwindow {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2, 2 };
        int k = 3;
        System.out.println(slidingWindow(arr, k));
    }

    public static int slidingWindow(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        // int sum = 8;

        int left = 0;
        int maxSum = sum;
        int right = k;
        while (right < arr.length - 1) {
            sum = sum - arr[left];
            left++;
            sum = sum + arr[right];
            right++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
}
