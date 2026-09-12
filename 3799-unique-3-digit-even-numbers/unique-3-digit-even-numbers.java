class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k && digits[i]!=0 ) {
                        int val = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (val % 2 == 0 ) {
                            set.add(val);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}