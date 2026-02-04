public class KthSorted {

    public static int KthSmallest(int arr[], int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 0, 2};
        int k = 3;

        System.out.println(KthSmallest(arr, k));
    }
}
