package ch04_Constructor;

public class Student {
	
	public int id;
	public String name;
	public int grade;
	
	// 클래스에 생성자가 하나도 없으면 "컴파일러"가 디폴트생성자를 넣어준다.!
	public Student() {
		System.out.println("student 생성");
	}
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return id + "번 학생은 " + grade + "학년 " + name;
	}
	
}
