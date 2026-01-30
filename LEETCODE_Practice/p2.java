import java.util.*;
public class p2 {
    public static int secondLargestElement(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return -1;
        }
        Arrays.sort(nums);

        // Largest element will be at last index
        int largest = nums[n - 1];

        int secondLargest = -1;

        // Traverse the sorted array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6, 7, 5 };
        int ans = secondLargestElement(nums);
        System.out.println("The second largest element is : " + ans);
    }

}

//My solution
//  public static int secondLargestElement(int[] nums) {
//         Arrays.sort(nums);
//         int largest = nums[nums.length - 1];
//         for (int i = nums.length - 2; i >= 0; i--) {
//             if (nums[i] != largest) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[] = { 8, 8, 7, 6, 5 };
//         // Solution sol = new Solution();
//         // int p = /* sol. */secondLargestElement(nums);
//         System.out.println(secondLargestElement(nums));
//     }
