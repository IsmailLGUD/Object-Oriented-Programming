package AbstractionClass;

abstract class Human extends Object{
	  public String name;
	  private int ssn;

	  void walk(){
	    
	  }

	  abstract void job();

	}


	class student extends Human{
	  @Override
	  void job(){
	    System.out.println("I am a student");
	  }
	}

	
	class teacher extends Human{
	  @Override
	    void job(){
	  System.out.println("I am a teacher!");
	  }
	}


	
	    
	 

public class HumanClassAbstractionJava {
	public static void main(String[] args) {

	student s1 = new student();
    s1.job();

    teacher t1 = new teacher();
    t1.job();


	}

}
