class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        // gives [3,30,34,5,9] to ["3","30","34","5","9"]

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        // compare like (3 ,30) as 330 or 303 which is greater  
        // and gives ["3","30","34","5","9"] to ["9", "5", "34", "3", "30"]

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str[i]);
        }
        // StringBuilder to nomal string : "9534330"
        String ans = sb.toString();

        return ans;

    }
}