public class SelectionSort {

    void sort(int arr[]) {
 
        int n = arr.length;
 
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int k = i + 1; k < n; k++) {
                if (arr[k] < arr[min])
                    min = k;
            }
 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
 
        }
    }

}
