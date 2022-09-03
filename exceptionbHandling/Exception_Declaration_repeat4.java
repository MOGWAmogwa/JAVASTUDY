package exceptionbHandling;

import java.io.File;

public class Exception_Declaration_repeat4 {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName() + " file is generated successfully.");
		}catch(Exception e) {
			System.out.println(e.getMessage() + " please type your file name one more time.");
		}

	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("file name is not valid");
		File f = new File(fileName);
		f.createNewFile();
		return f;
		
	}

}
