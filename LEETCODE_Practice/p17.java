// 6. Container With Most Water
// Difficulty: Medium
// Problem Statement:
// Given n vertical lines where each represents height, find two lines that together with the x-axis form a container that holds the most water.

// Sample Input
// height = [1,8,6,2,5,4,8,3,7]
// Sample Output
// 49
public class p17 {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            int val = min * (r - l);
            max = Math.max(max, val);
            if (height[r] >= height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
