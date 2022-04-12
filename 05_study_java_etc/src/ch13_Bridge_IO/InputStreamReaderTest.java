package ch13_Bridge_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// 안녕하세요는 FileInputStream로 읽으면 깨지므로 보조스트림인 InputStreamReader로 읽어준다.
		// InputStreamReader - 바이트단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while( (i = isr.read()) != -1){  //보조 스트림으로 읽습니다.
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
