import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;


class Solution {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the size of the list: ");
    int n = scanner.nextInt();

    System.out.println("Enter the list items: ");

    List<Integer> list = new ArrayList<>();
    
    for (int i=0; i<n; i++) {
      list.add(scanner.nextInt());
    }

    new Solution().quickSort(list, 0, n-1);

    System.out.println(list);

  }

  private void quickSort(List<Integer> list, int low, int high) {

    if (low < high) {
      int pi = partition(list, low, high);
      quickSort(list, low, pi-1);
      quickSort(list, pi+1, high);
    }
    
  }

  private int partition(List<Integer> list, int low, int high) {

    int i = low - 1;
      
    int pivot = list.get(high);
      

    for (int j=low; j<high; j++) {

        if (list.get(j) < pivot) {
          i++;
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
    }
    
    int temp = list.get(i+1);
    list.set(i+1, list.get(high));
    list.set(high, temp);

    return i+1;
  
  
}

}
