import java.util.ArrayList;

public class MergeSorting {

	// Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    
	void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        ArrayList<Integer> L = new ArrayList<Integer>(n1);
        ArrayList<Integer> R = new ArrayList<Integer>(n2);
 
        for (int i = 0; i < n1; ++i)
            L.add(i, arr.get(1 + i));
        for (int j = 0; j < n2; ++j)
            R.add(j, arr.get(m + 1 + j));
 
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
 
                arr.set(k, L.get(i));
                i++;
 
            } else {
                arr.set(k, R.get(j));
                j++;
            }
 
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
//          arr.add(k, R.get(j));
            arr.set(k, R.get(j));
            j++;
            k++;
        }
 
    }
 
    void mergeSort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
