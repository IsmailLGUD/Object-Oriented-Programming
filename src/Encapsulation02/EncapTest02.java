package Encapsulation02;

public class EncapTest02 {

	public static void main(String[] args) {
		
		Person02 p02 = new Person02();
		p02.setCountry("Bangladesh");
		p02.setJob("QA Tester");
		
		System.out.println("Country: " + p02.getCountry() + " and Job:" + p02.getJob());
		

	}

}
