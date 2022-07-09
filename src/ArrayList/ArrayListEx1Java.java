package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx1Java {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> number = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		result.addAll(number);
		
		System.out.println("ArrayList number = " + number);
		System.out.println("ArrayList size number = " + number.size());
		result.set(1, 4);
		
		Collections.sort(result);		
		System.out.println("Ascending of Result = " + result );
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println(result);

	}

}
