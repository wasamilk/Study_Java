package ch10_IO_Stream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			// 한글은 바이트단위로 읽으면 깨지므로, 보조스트림인 InputStreamReader로 입력을 받으면 깨지지않는다.
//			InputStreamReader irs = new InputStreamReader(System.in);
//			while( (i = irs.read()) != '\n' ) {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
