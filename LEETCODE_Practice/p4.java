import java.util.Arrays;

public class p4 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }  
        }

        // if all pairs matched, last element is single
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2, };
        System.out.println(singleNumber(nums)); // 4
    }
}

// Alternative way best way even in more than 2 same number.

// public static int singleNumber(int[] nums) {
// int result = 0;

// for (int i = 0; i < nums.length; i++) {
// result = result ^ nums[i];//result^=nums[i];
// }

// return result;
// }

// Properties of XOR:
// a ^ a = 0 → same numbers cancel out
// a ^ 0 = a → number remains same

// XOR is commutative & associative
// (order does not matter)

// So if every number appears twice except one:
// 2 ^ 3 ^ 2 = (2 ^ 2) ^ 3 = 0 ^ 3 = 3

// Example Walkthrough
// Input: nums = [4, 1, 2, 1, 2]

// result = 0
// 0 ^ 4 = 4
// 4 ^ 1 = 5
// 5 ^ 2 = 7
// 7 ^ 1 = 6
// 6 ^ 2 = 4
