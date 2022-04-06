package ch12_Array;

public class ObjectArrCopyTest {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] sCopyArr = new Book[5];
		Book[] dCopyArr = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			library[i] = new Book("title" + i, "author" + i);
			dCopyArr[i] = new Book();
			dCopyArr[i].setAuthor(library[i].getAuthor());
			dCopyArr[i].setTitle(library[i].getTitle());
			
		}
		
		// arraycopy = 얕은복사(주소값복사) : 요소에 객체 선언하고 복사해도 얕은복사가 되버림 
		System.arraycopy(library, 0, sCopyArr, 0, 5);
		//System.arraycopy(library, 0, dCopyArr, 0, 5);
		
		library[0].setTitle("============");	//원본을 바꾸면 카피도 바뀌고
		sCopyArr[3].setTitle("============");	//카피본을 바꿔도 원본이 바뀜.
		
//		for(Book book : library) {
//			System.out.print(book);
//			System.out.println(book.hashCode());
//			
//		}
//		System.out.println();
//		for(Book book : sCopyArr) {
//			System.out.print(book);
//			System.out.println(book.hashCode());
//		}
//		
		for(int i=0; i<library.length; i++) {
			System.out.print(library[i]);
			System.out.println(library[i].hashCode());
			System.out.print(sCopyArr[i]);
			System.out.println(sCopyArr[i].hashCode());
			System.out.print(dCopyArr[i]);
			System.out.println(dCopyArr[i].hashCode()); 
			System.out.println("===================================");
		}
		
		
	}
}
