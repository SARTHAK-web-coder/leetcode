class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1freq = new int[26];
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            char ch = s1.charAt(i);
            s1freq[ch - 'a']++;
        }
        int n = s2.length();
        int i = 0;
        while (i <= n - k) {
            int l = i;
            int r = i + k;
            int[] s2freq = new int[26];
            while (l < r) {
                char ch = s2.charAt(l);
                s2freq[ch - 'a']++;
                l++;
            }
            // // Compare frequency String
            if (Arrays.equals(s1freq, s2freq)) {
                return true;
            }
            i++;
        }
        return false;
    }
}