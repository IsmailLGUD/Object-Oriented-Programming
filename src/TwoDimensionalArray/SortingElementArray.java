package TwoDimensionalArray;
import java.util.Arrays;

public class SortingElementArray {

	public static void main(String[] args) {
	
		int [] number = {1,5,3,2,4,0};
		Arrays.sort(number);
		
		
		System.out.print("Ascending : ");
		for (int i = 0; i<5; i++) {
			System.out.print(" "+number[i]);
		}
		
		System.out.println();
		System.out.print("Descending : ");
		for (int i = 5; i>=0; i --) {
			System.out.print(" "+ number[i]);
		}
		
		String [] names = {"Ismail", "Mahdi", "Munim"};
		Arrays.sort(names);
		
		System.out.println();
		System.out.print("Ascending Names: ");
		for(int j =0; j<3; j++) {
			System.out.print(" " + names[j]);
		}
		
		System.out.println();
		System.out.print("Descending Names: ");
		for(int j = 2; j>=0; j--) {
			System.out.print(" " + names[j]);
		}
		
	}

}
