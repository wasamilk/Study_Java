package ch01_Obj_toString;

public class ToString {

	public static void main(String[] args) {
		Book book = new Book("test", "wb");
		
		// 출력(origin) - ch01_Object.Book@6f2b958e
		// 출력(override) - test,wb
		System.out.println(book);
		
		// 출력 - test String
		// toString()을 String클래스에서 오버라이딩 했기때문에 주소값이 아닌 문자열로 출력됨.
		String str = new String("test String");
		System.out.println(str);  //sysout은 toString()을 부름
		System.out.println(str.toString());
	}
}

class Book{

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}

}