package DirectoryCreateWriteRead;

import java.io.File;
import java.io.IOException;

public class FileCreating {

	public static void main(String[] args) {
		
		File dir = new File ("person");
		dir.mkdir();
		
		
		String path = dir.getAbsolutePath();
		
		
		File file1 = new File(path + "/student.txt");
		File file2 = new File(path + "/teacher.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("files are created!");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if(file1.exists()) {
			System.out.println("file1 exists");
		}else {
			System.out.println("file1 doesn't exists");
		}
		
		


	}

}
