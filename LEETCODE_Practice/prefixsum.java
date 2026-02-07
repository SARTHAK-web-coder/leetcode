public class prefixsum {// l=1 and r=3
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 8 };
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];// base case
        //
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];// here it calculate sum of cumilative sum of array = arr
        }
        //
        for (int i : prefix) {
            System.out.print(i + " ");// printing cumilative sum of array = arr
            //just understand how it work .
        }

        // finding sum from index l to r
        int l = 1, r = 3;
        int sum = prefix[r] - prefix[l - 1];
        System.out.println(sum);

    }

}
