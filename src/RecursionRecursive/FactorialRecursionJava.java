package RecursionRecursive;

public class FactorialRecursionJava {

	
		static int fact(int n){
		    if(n<=1)
		      return 1;
		    else
		      return n* fact(n-1);
		  }
		  
		  
		public static void main(String[] args) {
		    int result= fact(10);
		    System.out.println("Factorial 10 is = " + result);

		  }

	}


