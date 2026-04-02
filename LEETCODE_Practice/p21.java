//Maximum Average Subarray I
// nums = [1,12,-5,-6,50,3]
// k = 4

// output = 12.75
// Explanation
// Window sums:
// [1,12,-5,-6] = 2
// [12,-5,-6,50] = 51
// [-5,-6,50,3] = 42

// Maximum sum = 51
// Average
// 51 / 4 = 12.75

public class p21 {
    public static void main(String[] args) {
        int nums[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double wd = 0;
        for (int i = 0; i < k; i++) {
            wd = wd + nums[i];
        }
        double av = wd;
        for (int i = k; i < n; i++) {
            wd = wd + nums[i];
            wd = wd - nums[i - k];
            av = Math.max(av, wd);
        }
        return av / k;

    }

}