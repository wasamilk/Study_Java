package ch07_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionWithRecources {

	public static void main(String[] args) {

		/**
		 * try-with-resources
		 * try()내부에서 선언한 리소스를 자동으로 해제되도록 함.
		 * close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외발생한 경우나 모두 자동으로 해제 
		 * */
		try(FileInputStream fis = new FileInputStream("a.txt");) {
			System.out.println("read");
		} catch (FileNotFoundException e) {
			// 파일열고
			e.printStackTrace();
		} catch (IOException e) {
			// 자동으로 닫기까지 해줌을 의미
			e.printStackTrace();
		}
		System.out.println("end of try-catch");
	}
}
