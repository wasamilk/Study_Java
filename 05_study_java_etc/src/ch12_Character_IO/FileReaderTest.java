package ch12_Character_IO;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try (FileReader fis = new FileReader("reader.txt")){

			int i;
			while((i=fis.read())!=-1)
				System.out.print((char)i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
