//### 📝 Problem Statement
//Find the common elements between two //integer arrays using Java

import java.util.*;

class CommonSortedArray {

    
     //Finds common elements between two arrays using sorting + two pointers.
     
    public static ArrayList<Integer> commonElements(int[] a, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 6, 8};

        System.out.println(commonElements(a, b));
    }
}
