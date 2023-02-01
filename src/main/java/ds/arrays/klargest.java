/*
 * Click `Run` to execute the snippet below!
 */

import java.util.Scanner;

class Solution {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Size of array:");
    int n = scanner.nextInt();

    int arr[] = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println("Second largest = " + new Solution().quickSort(arr, 0, n-1, 3));

  }

  private int quickSort(int[] arr, int low, int high, int k) {
    if (low == high) {
      return arr[low];
    }
    int pi = partition(arr, low, high);
    // System.out.println("Pivot= " + pi);
    // for (int num: arr) {
    //   System.out.println(" " + num);
    // }
    if (pi == k-1) {
      return (arr[pi]);
    }
    else if (k-1 < pi) {
      return quickSort(arr, low, pi-1, k);
    }
    else {
      return quickSort(arr, pi+1, high, k);
    }

  }

  private int partition(int[] arr, int low, int high) {

    int i = low-1;
    int pivot = arr[high];

    for (int j=low; j<high; j++) {
      if (arr[j] < pivot) {
        i = i +1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = pivot;
    arr[high] = temp;
    
    return i+1;
  }
  
}

