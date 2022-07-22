package RecursionRecursive;

public class PowerFactorial {

	  static int power(int x, int y){
		if(y==1)
		      return x;
		    else{
		      return x * power(x, y-1);
		    }
		  }
		  
		  public static void main(String[] args) {
		    int x = 5, y = 3;
		    System.out.println("The "+ x + " to the power " + y + " is : "+ power(x, y));
		  }
}
