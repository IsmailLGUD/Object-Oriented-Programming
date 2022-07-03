package OOPProject001;

class NStudent{
	  String name;
	  int idNumber;
	  boolean isRegular;
	  double cgpa;
	  
	  void study(){
	    
	  }	
	  
	  void research(){
	    
	  }
	  
	  public NStudent() {

	    //default constructor
	    
	  }
	  
	  public NStudent(String N, int ID, double CGPA){
	    //overloading constructor
	    this.name = N;
	    this.idNumber = ID;
	    this.cgpa = CGPA;    
	  }
	  
	  @Override
	  public String toString(){
	    return "Student's Name is " + name + ", ID is " + idNumber + ", CGPA is " + cgpa;
	  }	  
	}

	class Teacher {
		String designation;
		int regNo;
		int classNumber;
		
		void teach() {
			
		}
	
	public Teacher() {
	//default constructor	
	}
	
	public Teacher (String D, int R, int C) {
		//overloading constructor
		this.designation = D;
		this.regNo = R;
		this.classNumber = C;
		System.out.println("Designation is " + designation + ", Registration Number is " + regNo + " and classNumber is " + classNumber);
	}
	}
	
public class StudentTeacherOOP {
	
	
	public static void main(String[] args) {
		
		NStudent s1 = new NStudent("Ismail", 20123811, 3.81);
		System.out.println(s1);
		
		NStudent s2;
		s2 = new NStudent();
		s2.idNumber = 20123811;
		System.out.println("ID number of the s2 is " + s2);
		
		NStudent s3 = new NStudent("Shihab", 20123920, 3.69);
		System.out.println(s3);
		
		NStudent s4 = new NStudent ("Ismail", 1125595, 4.83);
		System.out.println(s4);
		Teacher t1 = new Teacher("Lecturer", 2001, 5);
		System.out.println(t1);
	}
}