package dp;

public class LongestIncreasingSubsequence {

    int lis(int[] a) {

        int [] l = new int[a.length];
        int max = 1;
        for (int i=0; i<a.length; i++) {
            l[i] = 1;
            for (int j=0; j<i; j++) {
                if (a[j] <a[i] && l[i] < l[j]+1) {
                    l[i] = l[j] +1;
                }
            }
            if (max < l[i]) {
                max = l[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int array[] = {5, 7, 4, -3, 9, 1, 10, 4, 5, 8, 9, 3, 11};
        System.out.println("Result = " + new LongestIncreasingSubsequence().lis(array));
    }
}
