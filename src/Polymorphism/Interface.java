package Polymorphism;

abstract class Mammal{
	  void breathe(){
	    System.out.println("Generic Breathe");
	  }
	}



	interface Talkable{
	  void talk();
	}

	class Dog extends Mammal implements Talkable{
	  public void talk(){
	    System.out.println("That's a dog!");
	  }
	  public void doDogStuff(){
	    System.out.println("WOOF!");
	  }
	}

	
	
	class Cat extends Mammal{
	  @Override
	  public void breathe(){
	    System.out.println("I have kitten breath.");
	  }
	}

	
	
public class Interface {

	public static void main(String[] args) {
		
		
		

			

			    Cat c1 = new Cat();
			    Dog d1 = new Dog();
			    Cat c2 = new Cat();
			    Dog d2 = new Dog();
			    Mammal m1 = new Cat();
			    Mammal  m2 = new Dog();

			    d1.breathe();
			    c1.breathe();
			    d2.talk();
			    m1.breathe();
			    ((Dog)m2).talk();//TypeCasting Converter
			    m2.breathe();

			     
			    
			    
			  
			

	}

}
