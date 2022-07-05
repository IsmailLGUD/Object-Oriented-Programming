package ArrayList;
import java.util.ArrayList;

public class DeclaringArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		System.out.println("Size= " + number.size());
		
		number.add(22);
		number.add(21);
		number.add(20);
		number.add(3,19);
		
		
		System.out.println("Number = " +number);
		System.out.println("Size= " + number.size());
		
		
		boolean pos = number.contains(22);//Checking ArrayList contains any number
		System.out.println("It contains 22 : " +pos);
		
		
		int index = number.indexOf(21);//Finding index Number of any element in the Array
		System.out.println();
		System.out.println("Index of 21 is = " + index);
		
		number.set(1, 10);
		System.out.println("Number set = " + number);
			
		
//		for(int x : number) {
		//another method of printing ArrayList
//			System.out.print(" " + x);
//		}
//		
		
		number.remove(0);//Removing Element from ArrayList
		System.out.print("number remove= " +number);
		
		
		number.clear();//clearing the whole ArrayList
		System.out.println();
		System.out.print("number clear= " +number);
		
		
		boolean check = number.isEmpty();//Checking if the ArrayList is empty or not
		System.out.println();
		System.out.println(check);
		
		
		
	}

}
