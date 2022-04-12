package ch15_File_Class;

import java.io.IOException;
import java.io.RandomAccessFile;


/** 
 * RandomAccessFile class
 * 입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스 
 * 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능함
 * 다양한 메서드가 제공됨
 * */
public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// File과 다르게 파일이 없으면 만들어줌
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
	
		rf.seek(0); //seek() : 파일포인터 위치 이동
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		// write한 포맷으로 read해줘야함. 
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
