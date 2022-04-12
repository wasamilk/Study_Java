package ch11_Byte_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt",true)){ 
		
			byte[] bs = new byte[26];
			byte data = 65;        //'A' 의 아스키 값
			for(int i = 0; i < bs.length; i++){  // A-Z 까지 배열에 넣기
				bs[i] = data;
				data++;
				//bs[i] = data++;
			}
			
			fos.write(bs);  //배열 한꺼번에 출력하기
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
