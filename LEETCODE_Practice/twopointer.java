public class twopointer {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7, 13 };
        int target = 5;

        int left = 0, right = arr.length - 1;

        // boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("[" + left + "," + right + "]");
                System.out.println(arr[left] + "+" + arr[right] + "=" + target);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

    }
}
