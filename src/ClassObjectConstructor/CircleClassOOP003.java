package ClassObjectConstructor;

class Circle{
	  double radius;
	  double area;

	public Circle(){
	  //default constructor
	}  
	
	
	public Circle(double radius){
	  this.radius = radius;
	  
	  System.out.println("Area of the circle is " + radius*radius*3.1416);
	  }
	  
	}

public class CircleClassOOP003 {
	

	public static void main(String[] args) {


		Circle c1 = new Circle (2.5);
		//System.out.println(c1);
	}

}
