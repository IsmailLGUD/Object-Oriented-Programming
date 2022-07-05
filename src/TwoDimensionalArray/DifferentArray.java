package TwoDimensionalArray;

public class DifferentArray {

	public static void main(String[] args) {
		
		int [][] number = new int [3][];
		int k=0;
		
		number[0]= new int [1];
		number[1]= new int [2];
		number[2]= new int [3];
		
		for(int row =0; row<3; row++) {
			for (int column=0; column<row+1; column++) {
				number[row][column] = k;
				k++;
			}
		}
		
		for(int row=0; row<3; row++) {
			for (int column=0; column<row+1; column++) {
				System.out.print(number[row][column]+ " ");
			}
			System.out.println();
		}
				

	}

}
