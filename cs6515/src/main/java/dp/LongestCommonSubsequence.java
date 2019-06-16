package dp;

import java.io.IOException;

public class LongestCommonSubsequence {


    int lcs(char[] x, char[] y) {
        return lcaTable(x,y)[x.length][y.length];
    }

    String commonSubsquence(char[] x, char[] y) {
        int[][] table = lcaTable(x, y);
        StringBuilder sb = new StringBuilder();
        for (int i=x.length,j=y.length; i>=1 && j>=1;) {
            if (table[i][j] == table[i][j-1]) {
                j=j-1;
            }
            else if (table[i][j] == table[i-1][j]) {
                i=i-1;
            }
            else if (x[i-1] == y[j-1]) {
                sb.append(x[i-1]);
                i--;
                j--;
            }
        }
        return sb.reverse().toString();
    }


    int[][] lcaTable(char[] x, char[] y) {
        int[][] temp = new int[x.length + 1][y.length + 1];

        for (int i=0; i<temp.length; i++) {
            temp[i][0] = 0;
        }
        for (int i=0; i<temp[0].length; i++) {
            temp[0][i] = 0;
        }

        for (int i=1; i<temp.length; i++) {
            for (int j=1; j<temp[i].length; j++) {
                if (x[i-1] == y[j-1]) {
                    temp[i][j] = temp[i-1][j-1] +1;
                }
                else {
                    temp[i][j] = Math.max(temp[i][j-1], temp[i-1][j]);
                }
            }
        }
        return temp;
    }

    public static void main(String args[]) throws IOException {
        String x = "bcdbcdaif";
        String y = "abecbabidf";

        int result = new LongestCommonSubsequence().lcs(x.toCharArray(), y.toCharArray());

        System.out.println("Length of Longest common Subsequence = " + result);
        System.out.println("Longest common Subsequence = " + new LongestCommonSubsequence().commonSubsquence(x.toCharArray(), y.toCharArray()));

    }


}
