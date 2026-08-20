class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = { -1, -1 };
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return arr;
    }
}