// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class p20 {
    public static void main(String[] args) {
        int[] prices = { 7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int i = 0;
        while (i < prices.length) {
            min = Math.min(min, prices[i]);
            int val = prices[i] - min;
            max = Math.max(max, val);
            i++;
        }
        return max;
    }
}
