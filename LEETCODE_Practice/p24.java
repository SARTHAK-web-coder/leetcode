// Input: moves = "UD" or "LDRRLRUULR"
// Output: true
// Explanation: The robot moves up once, and then down once. 
// All moves have the same magnitude, so it ended up at the origin where it started. 
// Therefore, we return true.
public class p24 {
    // Robot Return to Origin
    public static void main(String[] args) {
        String moves = "RRLD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        char ch[] = new char[26];
        for (char c : moves.toCharArray()) {
            ch[c - 'A']++;
        }
        return ch['L' - 'A'] == ch['R' - 'A'] && ch['U' - 'A'] == ch['D' - 'A'];

    }

}
// public static boolean judgeCircle(String moves) {
// int v = 0;
// int h = 0;
// for (final char c : moves.toCharArray()) {
// switch (c) {
// case 'U':
// v++;
// break;
// case 'D':
// v--;
// break;
// case 'L':
// h--;
// break;
// case 'R':
// h++;
// break;
// }

// }
// return v == h;

// }
