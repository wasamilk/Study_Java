package Final_project;

import java.util.ArrayList;

public class Student {

	private int id;
	private String name;
	private ArrayList<Subject> subList = new ArrayList<>();

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showSubList() {
		int total = 0;
		for (Subject subject : subList) {
			System.out.println(subject.getName() + "과목 성적 : " + subject.getScore());
			total+=subject.getScore();
		}
		System.out.println("총점 : " + total);
	}

	public void setSubject(Subject subject) {
		subList.add(subject);
	}

}
