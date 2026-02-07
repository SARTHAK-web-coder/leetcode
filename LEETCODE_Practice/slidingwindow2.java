public class slidingwindow2 {// Q.// find max varible size (maxlength)
    public static void main(String[] args) {

        int[] arr = { 2, 5, 1, 10, 10 };
        int k = 16;

        System.out.println(leangthArr(arr, k));
    }

    public static int leangthArr(int[] arr, int k) {
        // complixity : O(2n)~=o(n)
        int left = 0;
        int right = 0;
        int maxlength = 0;
        int sum = 0;
        while (right < arr.length) {
            sum = sum + arr[right];
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }

            if (sum <= k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }
            right++;
        }
        return maxlength;

    }
}
// use your way for solve multiple pattern of these quetion with many
// possiblity.