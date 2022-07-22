package ExceptionHandling;

public class TryCatchFianllyHandling {

	public static void main(String[] args) {
		try {
			int a = 1;
			int b =0 ;
			int result = a/b;
			System.out.println("Result is " + result);
		} 
		catch (ArrayIndexOutOfBoundsException e ){
			System.out.println("Exception is " + e);
			
		}
		
		finally {
		System.out.println("Exception Handling Code");
		}

	}

}
