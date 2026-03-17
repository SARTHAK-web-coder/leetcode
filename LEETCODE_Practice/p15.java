// Input: g = [1,2,3], s = [1,1]
// Output: 1
// Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
// And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
// You need to output 1.

import java.util.Arrays;
// here first time use greedy algo
public class p15 {
    public static void main(String[] args) {
        int g[]={1,2,3};
        int s[]={1,1};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0;
        int j =0;
        int count =0;
        while (i<g.length && j<s.length) {
            if (g[i]<=s[j]) {
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
