package goodSchool;

public class SchoolTest {
	
	public static void main(String[] args) {
		
		School school = School.getInstance();
		
		//Subject(int subId, String subName)
		Subject korean = new Subject(1, "����");
		Subject math = new Subject(2, "����");
		school.getSubList().add(korean);
		school.getSubList().add(math);
		
		
		//Student(String stdName, int stdId, Subject major) {
		Student student1 = new Student("������", 211213, korean);
		Student student2 = new Student("������", 212330, math);
		Student student3 = new Student("�Ż��Ӵ�", 201518, korean);
		Student student4 = new Student("�̼���", 202360, korean);
		Student student5 = new Student("ȫ�浿", 201290, math);
		school.getStdList().add(student1);
		school.getStdList().add(student2);
		school.getStdList().add(student3);
		school.getStdList().add(student4);
		school.getStdList().add(student5);
		
		System.out.println(school);
	}
}
