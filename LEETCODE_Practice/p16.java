// Input: candyType = [6,6,6,6]
// Output: 1

// Input: candyType = [1,1,2,2,3,3]
// Output: 3
// Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

import java.util.HashSet;

public class p16 {
    public static void main(String[] args) {
        int candyType[] = { 6, 6, 6, 6 };
        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int n = candyType.length;
        int l = 0;
        while (l < n) {
            if (set.size() == n / 2) {
                return set.size();
            }
            set.add(candyType[l]);
            l++;
        }
        return set.size();
    }
}
