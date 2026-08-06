class Solution {
    public int smallestNumber(int n, int t) {
        int x = n + 10;
        int ans =0;
        while(n<x){
            int pro = 1;
            int dup = n;
            int a = n ;
            while(a!=0){
                int rem = a % 10;
                pro = pro * rem ;
                a = a / 10;
            }
            if(pro%t==0){
                ans = dup;
                break;
            }
            n++;
        }
        return ans;
    }
}