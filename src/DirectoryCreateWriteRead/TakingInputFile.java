package DirectoryCreateWriteRead;

import java.util.Formatter;
import java.util.Scanner;

public class TakingInputFile {

public static void main(String[] args) {
	
		String id, name;
		
		try {
		
		Formatter write = new Formatter("C:/Users/MD. ISMAIL HOSSAIN/workspace/Object-Oriented-Programming/person/student.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("How many Students you have: ");
		int num = input.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print("Please Enter Your id and Name: ");
			id = input.next();
			name = input.next();
			write.format("%s, %s\r\n", id, name);

		}
	
		write.close();
		
		}catch(Exception e) {
			System.out.println("exception is: " + e);
		}

	}
}
