// Question:
// Given an integer array nums, return the majority element.
// The majority element is the element that appears more than ⌊n/2⌋ times.
// You can assume that the majority element always exists in the array.

// Input:
// nums = [2, 2, 1, 1, 1, 2, 2]

// Output:
// 2

// Explanation:
// Array size = 7 → n/2 = 3.5 → majority must appear ≥4 times
// 2 appears 4 times → majority element = 2

public class BoyerMoore {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 1, 2, 5, 3 };
        System.out.println(majorElement(arr));
    }

    public static int majorElement(int arr[]) {
        // Boyer–Moore Voting Algorithm – Majority Element
        int count = 0;
        int element = 0;
        for (int num : arr) {
            if (count == 0) {
                element = num;// pick element as num in the arr
            }
            if (num == element) {
                count++;
            } else {
                count--;
            }
            return element;
        }
        return -1;
    }

}
// Complexity
// Time: O(n) → one loop
// Space: O(1) -> no extra space