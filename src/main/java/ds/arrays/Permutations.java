/*
 * Click `Run` to execute the snippet below!
 */

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;

class Solution {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string :");
    String str = scanner.nextLine();

    System.out.println(new Solution().permutation(str));
  }
  

  private List<String> permutation(String str) {
    if (str.length() == 1) {
      return Arrays.asList(str);
    }
    return placeCharInString(str.charAt(0), 
    permutation(str.substring(1, str.length())));
  }

  private List<String> placeCharInString(char c, List<String> permutations) {

    List<String> result = new LinkedList<>();

    for (String permutation : permutations) {

      for (int i=0; i<=permutation.length(); i++) {
        List<String> temp = getList(permutation);
        temp.add(i, c+"");
        result.add(StringUtils.join(temp, ",").replace(",", ""));
      }

    }
    return result;
  }

  private List<String> getList(String s) {
    List<String> list = new ArrayList<>();
    for (int i=0; i<s.length(); i++) {
      list.add(s.charAt(i) + "");
    }
    return list;
  }


}

