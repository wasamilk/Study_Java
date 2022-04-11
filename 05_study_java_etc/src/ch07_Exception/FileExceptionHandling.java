package ch07_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println("catch");
			e.printStackTrace();
			return;	//return해도 finally는 불린다.
		} finally {
			System.out.println("finally");
			if (fis != null) {
				System.out.println("fis != null");
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("end of try-catch");
	}
}
