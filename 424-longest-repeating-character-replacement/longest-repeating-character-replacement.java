class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int Freq[] = new int[26];
        
        int maxFreq = 0, maxLen = 0;
        int left = 0, right = 0;

        while (right < n) {
            char ch = s.charAt(right);
            Freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, Freq[ch - 'A']);

            while ((right - left + 1) - maxFreq > k) { // window size = (right - left + 1);
                char lch = s.charAt(left);
                Freq[lch - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }
        return maxLen;
    }
}