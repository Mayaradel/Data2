import java.util.ArrayList;

public class SelectionSort {

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
