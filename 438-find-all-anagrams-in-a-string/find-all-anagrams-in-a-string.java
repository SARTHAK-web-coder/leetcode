class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();

        List<Integer> ans = new ArrayList<>();
        if (m < n) {
            return ans;
        }

        HashMap<Character, Integer> pmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pmap.put(p.charAt(i), pmap.getOrDefault(p.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> newmap = new HashMap<>();
        int k = n;
        for (int i = 0; i < k; i++) {
            newmap.put(s.charAt(i), newmap.getOrDefault(s.charAt(i), 0) + 1);
            if (newmap.equals(pmap)) {
                ans.add(i - k + 1);
            }
        }
        for (int i = k; i < m; i++) {
            newmap.put(s.charAt(i), newmap.getOrDefault(s.charAt(i), 0) + 1);

            char remochar = s.charAt(i - k);
            newmap.put(remochar, newmap.get(remochar) - 1);// if new char allready present in it just reduce its freq
            if (newmap.get(remochar) == 0) {
                newmap.remove(remochar);// Remove the key if its frequency reaches zero
            }
            
            // compare both maps
            if (newmap.equals(pmap)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}