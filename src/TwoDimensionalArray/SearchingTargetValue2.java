package TwoDimensionalArray;

public class SearchingTargetValue2 {

	public static void main(String[] args) {

		int count=0;
		int target=3;
		boolean flag=false;
		int [][] number = new int[][] {{1,2,3}, {4,5,6}};
		
		for (int row=0; row<number.length; row++) {
			for (int col=0; col<number[row].length; col++) {
				 
				if (number[row][col]== target) {
					flag = true;
					count = count + 1;
				}				
			}
		}
		
		
		if(flag == true) {
			System.out.println("The " + target + " is " + count + " times");
		}else {
			System.out.println(target + " doesn't exists!");
		}
	}

}
