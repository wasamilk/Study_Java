package ch13_Bridge_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	
	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis(); //현재시간
			
			int i;
			// fis로 한바이트씩 읽고쓰고도 가능하지만, 버퍼로 읽고쓰는것보다 시간이 오래걸림
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond; //소요시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
		
		/*  
		 // 보조스트림으로 리더와 버퍼 모두 사용하는 example
		 Socket socket = new Socket();
		 new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 */
	}
}
