import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File f1 = new File("trial.txt");
		File f2 = new File("trial2.txt");

		FileReader fr1 = new FileReader(f1);
		FileReader fr2 = new FileReader(f2);

		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		String line1, line2;
		ArrayList<Integer> lines1 = new ArrayList<>();
		ArrayList<Integer> lines2 = new ArrayList<>();

		while ((line1 = br1.readLine()) != null) {
			lines1.add(Integer.parseInt(line1));
		}

		while ((line2 = br2.readLine()) != null) {

			lines2.add(Integer.parseInt(line2));
		}

		br1.close();
		br2.close();

		long startTime1 = System.currentTimeMillis();
		//st.sort(lines1);
		long endTime1 = System.currentTimeMillis();

		long startTime2 = System.currentTimeMillis();
	//	st.buildHeap(lines2, lines2.size());
		long endTime2 = System.currentTimeMillis();

		if (lines1.equals(lines2)) {
			System.out.println("The two files are identical");
		} else {
			System.out.println("The two files are not identical");
		}

		long executionTime = endTime1 - startTime1;
		System.out.println("The running time of O(n^2) is " + executionTime + "ms");
		long executionTime2 = endTime2 - startTime2;
		System.out.print("The running time of O(nlogn) is " + executionTime2 + "ms");
	}
}
