public class KthSorted {

    public static int KthSmallest(int arr[], int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 0, 2};
        int k = 3;

        System.out.println(KthSmallest(arr, k));
    }
}
