package DirectoryCreateWriteRead;

import java.util.Formatter;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
		
		Formatter write = new Formatter("C:/Users/MD. ISMAIL HOSSAIN/workspace/Object-Oriented-Programming/person/student.txt");
		write.format("%s, %s\r\n", "101", "Ismail");
		write.format("%s, %s\r\n", "102", "Mahdi");
		write.format("%s, %s\r\n", "103", "Munim");
		write.format("%s, %s\r\n ", "104", "Myeda");
		write.close();
		
		}catch(Exception e) {
			System.out.println("exception is: " + e);
		}

	}

}
