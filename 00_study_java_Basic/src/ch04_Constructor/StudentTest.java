package ch04_Constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student();
		Student kim = new Student(1,"kim",3);
		
		System.out.println(lee.showStudentInfo());
		System.out.println(kim.showStudentInfo());
		
	}

}
