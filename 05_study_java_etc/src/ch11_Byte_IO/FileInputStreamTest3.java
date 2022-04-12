package ch11_Byte_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	
	public static void main(String[] args) {
 		
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			
			int i; // int read(byte b[]) -> 읽은 자료의 바이트 수를 반환(the total number of bytes)
			
			while ( (i = fis.read(bs)) != -1){
				/*for(byte b : bs){
					System.out.print((char)b);
				}*/
				
				// 매번 버퍼를 비워주는 식으로 구현해도 됨
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(" : " +i + "바이트 읽음" );
			}
			
			/** raed(bs,x ,y) : bs[x]부터 y개가 순서대로 쓰여지는거임 */
//			 while ( (i = fis.read(bs, 1, 8)) != -1){ 
//				for(int k= 1; k<=i; k++){
//					System.out.print((char)bs[k]);
//				}
//				System.out.println(": " +i + "바이트 읽음" );
//			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}