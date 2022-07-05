package Encapsulation;

class Temperature{
	private int tem;
	
	void Temperature(){
		//metod/function
	}
	
	public  Temperature() {
		//default constructor
		tem = 70;
	}
	
	public void SetTem(int t) {
		tem= t;
	}
	
	public int GetTem() {
		return tem;
	}
	
	
}

public class TemperatureMessage{

	public static void main(String[] args) {


		Temperature t1 = new Temperature();
		t1.SetTem(12);
		System.out.println(t1.GetTem());

	}

}
