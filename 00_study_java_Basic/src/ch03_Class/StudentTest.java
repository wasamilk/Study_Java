package ch03_Class;

public class StudentTest {

	public static void main(String[] args) {

		Student std1 = new Student();
		
		std1.studentID = 123;
		std1.setStudentName("Lee");
		std1.address = "seoul";
		
		std1.showSudentInfo();
		
		Student std2 = new Student();
		
		std2.studentID = 5353;
		std2.setStudentName("Kim");
		
		std2.address = "busan";
		
		std2.showSudentInfo();
		
	}

}
