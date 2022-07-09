package ClassObjectConstructor;

class Human extends Object{
	  String name;
	  int age;
	  private int height;
	  private int weight;

	  void breathe(){
	    //functions
	    System.out.println("Human :: breathe ");
	  }

	  
	  void eat(){
	    //funcitons or method
	    System.out.println("Human :: eat");
	  }

	  void run(){
	    System.out.println("Human :: run");
	  }
	  	
	  public void setHeight(int h) {
		  height = h;
	  }
	  
	  public int getHeight() {
		  return height;
	  }
	  
	  public Human(){
	    //default constructor
	  }

	  public Human (String n, int a){
	    //overloading or argumental constructor
	    name= n;
	    age= a;
	  }

	  @Override
	  public String toString (){

	    return "Your name is : "+ name;
	  } 
	}



	class Students extends Human{

	  private int idNumber;
	  private String name;
	  public double result;
	  private boolean isHuman;
	  public void study(){
	    System.out.println("Students :: study");
	    
	  }
	 	 
	  
	}
	
	
	
public class InheritHumanStudentsOOP {

	public static void main(String[] args) {

		 Human h1 = new Human();
		    h1.age = 22;    
		    System.out.println("h1.age = " + h1.age);

		    Students s1 = new Students();
		    s1.result = 3.81;
		    s1.age=22;//public attributes can be accessed through inheritance from  Human class to Studensts class
		    s1.setHeight(20123811);
		    
		   
		    System.out.println("s1.result = " + s1.result);
		    System.out.println("s1.age = " + s1.age);
		     
		    
		 
	}

}