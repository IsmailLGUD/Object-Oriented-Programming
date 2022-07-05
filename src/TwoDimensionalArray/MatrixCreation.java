package TwoDimensionalArray;

public class MatrixCreation {

	public static void main(String[] args) {
		
		int [][] result= new int [4][5];
		int k=0;
		
		for (int row=0; row<4; row++) {
			for(int column =0; column<5; column++) {
				result [row][column]= k;
				k++;
			}
		}

		for (int row=0; row<4; row++) {
			for(int column =0; column<5; column++) {
				System.out.print(" "+ result[row][column]);
			}
			System.out.println();
		}
	}

}