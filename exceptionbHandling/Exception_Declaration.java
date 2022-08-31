package exceptionbHandling;

import java.io.File;

public class Exception_Declaration {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println( f.getName() + " file is generated successfully.");
		} catch (Exception e) {
			System.out.println( e.getMessage() + " please type your file name again.");
		}

	}
	
	
	static File createFile(String fileName) throws Exception { // 예외를 발생시키는 키워드 throw 와 에외를 메서드에 선언할 때 쓰이는 Throws를 잘 구별하자 
		if (fileName == null || fileName.equals(""))
			throw new Exception("file name is not valid.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}


// Exception 모든 예외의 최고 조상 (모든 예외의 종류가 발생 가능하다는 의미 )