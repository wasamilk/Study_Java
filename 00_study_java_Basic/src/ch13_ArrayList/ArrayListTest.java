package ch13_ArrayList;

import java.util.ArrayList;

import ch12_Array.Book;


// ArrayList -> add, remove, get, isEmpty...
public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));

		System.out.println(library.size());
		library.remove(2);
		System.out.println(library.size());
		
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
		
	}
}
