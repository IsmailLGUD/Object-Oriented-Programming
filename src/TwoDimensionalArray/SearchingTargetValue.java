package TwoDimensionalArray;

public class SearchingTargetValue {

	public static void main(String[] args) {
		
		int[] [] myData = {{1,2,3,4,5,6},
						   {6,5,4,3,3,2},
						   {3,4,3,2,3,3}
		};
		
		int target=3, count=0;
		
		for (int row=0; row<myData.length; row++) {
			for (int col=0; col<myData[row].length; col++) {
				if(myData[row][col]==target) {
					count++;
				}
				
			}
		}
		
		if (count==0) {
			System.out.println("The target number 3 does not exists!");
		}
	
		else{
			System.out.println("The target number " + target + " exists " + count + " times");
		}

	}

}
