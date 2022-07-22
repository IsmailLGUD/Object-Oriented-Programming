package RecursionRecursive;

public class FibonacciJavaEx1 {

	
		static int fab(int i){
		    if (i<=1)
		      return 0;
		    else if (i == 2)
		      return 1;
		    else 
		      return fab(i-2) + fab (i-1);
		      
		  }
		public static void main(String[] args) {
		      int number = 10;
		  
		        //print first 10 numbers of fibonacci series
		        System.out.print ("Fibonacci Series: First 10 numbers: ");
		        for (int i = 1; i <= number; i++) 
		        {
		            System.out.print(fab(i) + " ");
		        }
		  }

	}


