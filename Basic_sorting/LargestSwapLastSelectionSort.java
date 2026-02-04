import java.util.Arrays;

public class LargestSwapLastSelectionSort {
  public static void main(String[] args) {

    int arr[] = {8, 6, 4, 0, 3, 9};
    int n = arr.length;

    System.out.println("Before sorting: " + Arrays.toString(arr));

    // Selection sort (largest to last)
    for (int i = 0; i < n - 1; i++) {

      int max = Integer.MIN_VALUE;
      int mindex = -1;

      // find largest in unsorted part
      for (int j = 0; j < n - i; j++) {
        if (arr[j] > max) {
          max = arr[j];
          mindex = j;
        }
      }

      // swap largest with last unsorted position
      int temp = arr[n - 1 - i];
      arr[n - 1 - i] = arr[mindex];
      arr[mindex] = temp;
    }

    System.out.println("After sorting:  " + Arrays.toString(arr));
  }
}

