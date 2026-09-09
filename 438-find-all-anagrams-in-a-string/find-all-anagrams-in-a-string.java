class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        if(k>n){
            return ans;
        }
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<k;i++){
            a[p.charAt(i)-'a']++;
        }
        for(int i=0;i<k;i++){
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)){
            ans.add(0);
        }
        for(int i=k;i<n;i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(i-k)-'a']--;

            if(Arrays.equals(a,b)){
                ans.add(i-k+1);
            }
        }
        return ans;
    }
}