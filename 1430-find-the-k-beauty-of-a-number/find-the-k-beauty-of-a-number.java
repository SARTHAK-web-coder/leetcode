class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n - k + 1; i++) {
            String val = s.substring(i, i + k);
            int res = Integer.parseInt(val);
            if (res != 0 && num % res == 0) {
                count++;
            }
        }
        return count;
    }
}