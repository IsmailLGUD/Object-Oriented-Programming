package TwoDimensionalArray;
import java.util.Scanner;

public class SumDiagonalUpperLowerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] [] E= new int [2][3];
		int sumDiagonalElement=0;
		int sumUpperElement=0;
		int sumLowerElement=0;
		
		
		System.out.println("Please enter the value of C Matrix: ");
		for (int row=0; row<2; row ++) {
			
			for (int column = 0; column<3; column++) {
				System.out.printf("C [%d][%d]= ", row ,column);
				E[row][column]=sc.nextInt();
			}
		}
			
		
		System.out.print("\n");
		System.out.print("A = ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ E[row][column]);
				
				if (row==column) {
					sumDiagonalElement = sumDiagonalElement+E[row][column];
				}
				
				if (row <column) {
					sumUpperElement = sumUpperElement + E[row][column];
				}
				
				if(row>column) {
					sumLowerElement = sumLowerElement + E[row][column];
				}
				
				
			}
						
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("Sum of Diagonal Element is "+ sumDiagonalElement);
		System.out.println("Sum of Upper Element is "+ sumUpperElement);
		System.out.println("Sum of Diagonal Element is "+ sumLowerElement);
		


	}
}
