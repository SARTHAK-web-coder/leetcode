class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] pFreq = new int[26];
        int k = p.length();
        for (int i = 0; i < k; i++) {
            char ch = p.charAt(i);
            pFreq[ch - 'a']++;
        }
        int n = s.length();
        int i = 0;
        while (i <= n - k) {
            int[] windowFreq = new int[26];
            int l = i;
            int r = i + k;
            int count = 0;
            while (l < r) {
                char ch = s.charAt(l);
                windowFreq[ch - 'a']++;
                l++;
            }

            // // Compare frequency Array
            if (Arrays.equals(windowFreq, pFreq)) {
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}