import java.util.Scanner;
// This approach is called Linear Search without array storage.
public class p6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// total no array “I will give N numbers”
        int X = sc.nextInt();// “Search number 3”

        boolean found = false;
        for (int i = 0; i < N; i++) {
            int element = sc.nextInt();//These are the 5 numbers.
            if (element == X) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

}

//input
// 4 total N no.
// 5 search no.
// 1 2 5 7  N or 4 are these no.
//output
//Yes
