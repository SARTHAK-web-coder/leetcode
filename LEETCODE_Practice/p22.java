//Intersection of Two Arrays
// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.Arrays;
import java.util.HashSet;

public class p22 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 2, 4, };
        int[] nums2 = { 1, 4 };
        int res[] = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> newset = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < m; j++) {
            if (set.contains(nums2[j])) {
                newset.add(nums2[j]);
            }
        }
        int arr[] = new int[newset.size()];
        int k = 0;
        for (int val : newset) {
            arr[k++] = val;
        }
        return arr;

    }

}