class Solution {
    public String frequencySort(String s) {
        int[] str = new int[128];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            str[s.charAt(i)]++;
        }

        // Find maximum frequency
        int max = 0;

        for (int i = 0; i < 128; i++) {
            max = Math.max(max, str[i]);
        }

        StringBuilder sb = new StringBuilder();

        // Process frequency from highest to lowest
        for (int freq = max; freq >= 1; freq--) {

            // Find characters having this frequency
            for (int i = 0; i < 128; i++) {

                if (str[i] == freq) {

                    char ch = (char) i;

                    // Add character 'freq' times
                    for (int j = 0; j < freq; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}