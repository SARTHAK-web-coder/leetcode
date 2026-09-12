class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxVal = 0;
        int max = 0;
        int l = 0;
        int r = 0;
        while (r < n) {
            char ch = s.charAt(r);
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
            if (count > max) {
                max = count;
            }
            // max = Math.max(max ,count);
            int window = r - l + 1;
            if (window - max > k) {
                int count2 = map.getOrDefault(s.charAt(l), count) - 1;
                map.put(s.charAt(l), count2);
                l++;
            }
            maxVal = Math.max(maxVal, r - l + 1);
            r++;
        }
        return maxVal;
    }
}