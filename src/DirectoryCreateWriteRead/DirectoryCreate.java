package DirectoryCreateWriteRead;

import java.io.File;

public class DirectoryCreate {

	public static void main(String[] args) {
		
		File dir = new File("person");
		dir.mkdir();

	}

}
