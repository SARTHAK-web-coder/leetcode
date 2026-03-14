// 349. Intersection of Two Arrays
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.Arrays;

public class p13 {
    public static void main(String[] args) {
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };
        int result[] = intersection(nums1, nums2);
        int w = Math.min(nums1.length, nums2.length);
        System.out.println(Arrays.toString(Arrays.copyOf(result, w)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l = 0;
        int r = 0;
        int t = Math.max(nums1.length, nums2.length);
        int arr[] = new int[t];
        int k = 0;
        if (t <= nums1.length) {
            while (l < t) {
                if (nums1[l] == nums2[r]) {
                    arr[k] = nums1[l];
                    k++;
                } else if (nums1[l] > nums2[r]) {
                    r++;
                } else {
                    l++;
                }
                l++;
            }
            return arr;
        } else {
            while (r < t) {
                if (nums1[l] == nums2[r]) {
                    arr[k] = nums1[l];
                    k++;
                } else if (nums1[l] > nums2[r]) {
                    r++;
                } else {
                    l++;
                }
                r++;
            }
            return arr;
        }
    }
}
