package Final_project;

public class FinalMain {

	public static void main(String[] args) {
		Student lee = new Student(1001, "lee");
		Student kim = new Student(1001, "kim");
		
		lee.setSubject(new Subject("국어", 100));
		lee.setSubject(new Subject("수학", 50));
		kim.setSubject(new Subject("국어", 70));
		kim.setSubject(new Subject("수학", 85));
		kim.setSubject(new Subject("영어", 100));
	
		lee.showSubList();
		kim.showSubList();
		
	}

}
