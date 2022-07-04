package ClassObjectConstructor;
class Dog{
	  
	  int legs;
	  String color;
	  float weight;
	  String food;
	  boolean isPet;
	  
	  void eat(){ 
	    //This is a funciton also known as method
	  }
	  
	  void sleep() { 

 	    //This is a funciton also known as method
	    
	  } 

	  
	  public Dog(){
	    //default constructor
	    System.out.println("The Dog()constructor is called");
	    legs = 4;
	    color = "yellow";
	    weight = 20;
	    food = "rice";
	    isPet = true;
	  }
	//Method overloading
	  
	  public Dog(int l, String col, float weight){
	    //declaring parameter
	    
	    legs = l;
	    color = col;
	    this.weight = weight;//if parameter is in same name
	    
	    //System.out.println("\n Dog has "+ l + " legs, with " + l + " color and weight is "+ weight +"\n");
	        
	  }  
	  @Override
	  public String toString(){

	    //toString method must declare default method
	    
	    return "legs = " + legs + ", color " + color + " and weight is "+ weight ;
	  }
	 
	}


	

public class DogOOP001 {

	public static void main(String[] args) {
//			int s2;
//		    s2 = 20;
//		    int s1 = 10;
		    
		    Dog d4; //creating object
		    d4 = new Dog(); //declaring object
		    
		    Dog d3 = new Dog(4, "White", 15);//entering the value of parameter
		    //d4.color = "black";
		    
		    d3.isPet = true;
		    System.out.println(d3);
		    
		    System.out.println("The dog's color is " + d4.color);
		    System.out.println("The dog has " + d4.legs + " legs");
		    System.out.println("The dog eat " + d4.food);
		    System.out.println("The dog is a " + d4.isPet );

		    //d3.Dog(4, "White", 15);

	}

}
