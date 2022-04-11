package ch07_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	// throws 할 경우 해당 메소드를 호출한 쪽으로 예외처리를 미룬다는 의미
	public Class loadClass(String filename, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		Class c = Class.forName(className);
		return c;
	}
	
	// main에서 throws 할 경우 예외처리가 VM으로 넘어감
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();

		try {
			test.loadClass("a.txt", "abc");
			
		} catch (ClassNotFoundException | FileNotFoundException e) {
			// multiException Handling
			e.printStackTrace();
			
		} catch (Exception e) { 
			// 어떤 exception이던 최상위클래스인 Exception으로 upcasting.. 
			// 따라서 마지막 catch블럭으로 써야함
			// defaultException Handling
			e.printStackTrace();
		}
	}
}
