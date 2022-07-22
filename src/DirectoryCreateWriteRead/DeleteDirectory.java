package DirectoryCreateWriteRead;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {
		
		File dir = new File ("C:/Users/MD. ISMAIL HOSSAIN/Desktop/sadik");
		dir.mkdir();
		String DirLocation = dir.getAbsolutePath();
		System.out.println(DirLocation);
		System.out.println(dir.getName());
		if(dir.delete()) {
			System.out.println("person folder from Desktop is deleted");
		}

	}
}
