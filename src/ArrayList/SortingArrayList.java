package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		System.out.println("Size= " + number.size());

		number.add(22);
		number.add(21);
		number.add(20);
		number.add(3, 19);

		System.out.println("Number = " + number);

		Collections.sort(number);
		System.out.println("Number Ascending = " + number);

		Collections.sort(number, Collections.reverseOrder());
		System.out.println("Number Descending = " + number);
	}

}
