package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			int a = 1;
			int b =0 ;
			int result = a/b;
			System.out.println("Result is " + result);
		} catch (Exception e ){
			System.out.println("Exception is " + e);
			
		}
		
		System.out.println("Exception Handling Code");

	}

}
