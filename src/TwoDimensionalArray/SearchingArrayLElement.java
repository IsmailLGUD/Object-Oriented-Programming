package TwoDimensionalArray;
import java.util.Scanner;


public class SearchingArrayLElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int myData[][] = new int [2][3];
	    int target, count=0;
	    System.out.print("Please enter your targeted value: ");
	    target = input.nextInt();
	    
	    System.out.print("Please enter element in myData: ");
	    for (int row=0; row<myData.length; row++){
	      for(int col=0; col<3; col++){
	    	  System.out.println();
	        System.out.printf("myData [%d][%d]= ", row ,col);
	        myData [row][col]= input.nextInt();
	        if (myData[row][col]==target){
	          count++;
	        }
	      }
	    }
	    
	  System.out.println();
	  System.out.print("myData = ");
			for (int row =0; row<myData.length; row++) {
				for (int col = 0; col<3; col++) {
					System.out.print("\t "+ myData[row][col]);
				}
				System.out.println();
			}
	    
	    
	    if (count==0){
	      System.out.println("The target number " + target + " doesn't exists"); 
	    }

	    else{
	      System.out.println("The target number " + target + " exists " + count + " times");
	    }

	}
}
