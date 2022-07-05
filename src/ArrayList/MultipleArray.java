package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class MultipleArray {

	public static void main(String[] args) {
		
		ArrayList <Integer> Result = new ArrayList<>();
		ArrayList <Integer> Result01 = new ArrayList<>();
		ArrayList <Integer> Result02 = new ArrayList<>();
		
		Result.add(3);
		Result.add(4);
		Result.add(5);
		
		Result01.add(3);
		Result01.add(4);
		Result01.add(5);
		
		Result02.addAll(Result01);
		
		
		System.out.println("Result = " + Result );
		System.out.println("Result01 = " + Result01 );
		System.out.println("Result02 = " + Result02 );

	}

}
