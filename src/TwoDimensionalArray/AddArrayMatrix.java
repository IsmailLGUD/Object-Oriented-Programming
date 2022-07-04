package TwoDimensionalArray;
import java.util.Scanner;

public class AddArrayMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] [] C= new int [2][3];
		int [] [] D= new int [2][3];
		
		
		System.out.println("Please enter the value of C Matrix: ");
		for (int row=0; row<2; row ++) {
			
			for (int column = 0; column<3; column++) {
				System.out.printf("C [%d][%d]= ", row ,column);
				C[row][column]=sc.nextInt();
			}
		}
		
		
		System.out.println("\nPlease enter the value of D Matrix: ");
		for (int row=0; row<2; row ++) {
			
			for (int column = 0; column<3; column++) {
				System.out.printf("D [%d][%d]= ", row ,column);
				D[row][column]=sc.nextInt();
			}
		}
		
		
		System.out.print("A = ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ C[row][column]);
			}
			System.out.println();
		}
		
		System.out.print("\n\n");
		System.out.print("B = ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ D[row][column]);
			}
			System.out.println();
		}
		
		//adding C and D
		
		System.out.print("\n\n");
		System.out.print("C+ D= ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ (C[row][column]+ D[row][column]));
			}
			
			System.out.println();
		}
		
		System.out.print("\n\n");
		System.out.print("C - D= ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ (C[row][column]- D[row][column]));
			}
			
			System.out.println();
		}

		System.out.print("\n\n");
		System.out.print("C * D= ");
		for (int row =0; row<2; row++) {
			for (int column = 0; column<3; column++) {
				System.out.print("\t "+ (C[row][column]* D[row][column]));
			}
			
			System.out.println();
		}

	}

}
