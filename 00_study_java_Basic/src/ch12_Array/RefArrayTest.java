package ch12_Array;

public class RefArrayTest {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			library[i] = new Book("title" + i, "author" + i);
		}
		
		for(Book book : library) {
			System.out.println(book);
		}
	}
}
