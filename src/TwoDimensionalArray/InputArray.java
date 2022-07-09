package TwoDimensionalArray;
import java.util.Scanner;


public class InputArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] [] A = new int [2] [3];
		int [] [] B = new int [2] [3];
		
		//taking value of 
		System.out.println("Please enter value for A Matrix: ");
		for (int row=0; row < 2; row++) {				
				for (int column=0; column < 3; column++) {					
					System.out.printf("A[%d][%d] = ", row, column);
						A[row][column] = input.nextInt();
					}
				//System.out.print(" " + A [row][column]);
			}
			
		
		System.out.println("Please enter value for B Matrix: ");
			for (int row=0; row < 2; row++) {				
				for (int column=0; column < 3; column++) {
					
					System.out.printf("B[%d][%d] = ", row, column);
						B[row][column] = input.nextInt();
					}
				//System.out.print(" " + B [row][column]);
			}
			
			System.out.println("A= ");
			for (int row=0; row < 2; row++) {
				for (int column=0; column < 3; column++) {
					System.out.print(" " + A[row][column]);
				}
				System.out.println();
			}
			
			
			
			System.out.println("B= ");
			for (int row=0; row < 2; row++) {
				for (int column=0; column < 3; column++) {
					System.out.print(" " + B[row][column]);
				}
				System.out.println();
			}
			
			
	}

}
