package TwoDimensionalArray;

public class NestedForLoopsHalfPyramid {

	public static void main(String[] args) {
		
		int row = 5;
		
		for (int i =row; i>=1; --i ) {
			for (int col=1; col<=i; ++col) {
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
		
		
	}

}
