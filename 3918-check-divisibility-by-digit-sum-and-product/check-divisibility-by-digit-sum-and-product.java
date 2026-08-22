class Solution {
    public boolean checkDivisibility(int n) {
        int val = n;
        int sum =0;
        int product =1;
        while(n!=0){
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10 ;
        }
        int ans = sum + product;
        return ans != 0 && val % ans == 0;
    }
}