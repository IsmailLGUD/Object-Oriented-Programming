package ClassObjectConstructor;

class Robot{
	  
	private String name;
	private int speed;
	private double latitude;
	private double longitude;
	  
	public Robot(){
	  //default constructor
	  
	}
	
	
	public Robot(String name, int speed,double latitude,double longitude){
	  
	  
	  this.name = name;
	  this.speed = speed;
	  this.latitude = latitude;
	  this.longitude = longitude;
	  
	   }
	  
	   public void North()  {
	     latitude += speed; 
	     
	   }
	  
	   public void South(){ 
	     latitude -= speed; 
	     
	   }
	  
	   public void East(){ 
	     longitude += speed;
	     
	   }
	  
	   public void West(){ 
	     longitude -= speed; 
	     
	   }

	  public void setSpeed(int speed){ 
	     this.speed = speed; 
	     
	   }

	  
	   public int  getSpeed(){ 
	     return speed; 
	     
	   }
	  
	   
	  
	   public String getName(){
	     return name;
	   }
	  
	   public void setName (String name ){
	     this.name = name; 
	   }
	  
	   public double getLatitude(){ 
	     return latitude;
	   }
	  
	   public void setLatitude (double latitude){
	     this.latitude = latitude;  
	   }
	  
	   public double getLongitude(){ 
	     return longitude;
	   }
	  
	   public void setLongitude (double longitude){
	     this.longitude = longitude;  
	   }
	 
	}


public class RoboticsClass {

	public static void main(String[] args) {
		

			

			  Robot r1 = new Robot();
			  
			  System.out.println("r1.name = "  + r1.getName() );
			  System.out.println("r1.speed = "  + r1.getSpeed() );
			  System.out.println("r1.latitude = "  + r1.getLatitude() );
			  System.out.println("r1.longitude = "  + r1.getLongitude() );
			  
			  
			  Robot r2 = new Robot("Robby", 10, 120.45, 240.54);
			  System.out.println("r2.name = "  + r2.getName() );
			  System.out.println("r2.speed = "  + r2.getSpeed() );
			  System.out.println("r2.latitude = "  + r2.getLatitude() );
			  System.out.println("r2.longitude = "  + r2.getLongitude() );
			 
			  r2.North();
			  r2.West();
			  System.out.println("r2.name = "  + r2.getName() );
			  System.out.println("r2.speed = "  + r2.getSpeed() );
			  System.out.println("r2.latitude = "  + r2.getLatitude() );
			  System.out.println ("r2.longitude = "  + r2.getLongitude() );
			  
			 
			
	}

}
