import java.util.ArrayList;

public class Heap {


    public void buildHeap(ArrayList<Integer> array, int n) {
 
        for (int i = n; i >= 0; i--)
            maxHeapify(array, n, i);
    }
 
    public void maxHeapify(ArrayList<Integer> array, int n, int i) {
        int leftChild = (2 * i) + 1;
        int rightChild = (2 * i) + 2;
        int max = i;
 
        if (leftChild < n && array.get(leftChild) > array.get(max)) {
            max = leftChild;
        }
        if (rightChild < n && array.get(rightChild) > array.get(max)) {
            max = rightChild;
        }
        if (max != i) {
//          swap(i, max);
 
            int temp = array.get(i);
            array.set(i, array.get(max));
            array.set(max, temp);
 
            maxHeapify(array, n, max);
        }
    }
 
    void sort(ArrayList<Integer> array) {
        int n = array.size();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int k = i + 1; k < n; k++) {
                if (array.get(k) < array.get(min))
                    min = k;
            }
            int temp = array.get(i);
            array.set(i, array.get(min));
            array.set(min, temp);
 
        }
}
}
