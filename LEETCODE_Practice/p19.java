// Given two strings needle and haystack, return the index of the
// first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class p19 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";// output = 4
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return i - m;
                }
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return -1;

        // OR
        // if (haystack.contains(needle)) {
        // return haystack.indexOf(needle);
        // } else {
        // return -1;
        // }
    }

}