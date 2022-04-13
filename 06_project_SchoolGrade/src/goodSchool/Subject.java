package goodSchool;

import java.util.List;

public class Subject {

	private int subId;
	private String subName;
	private int gradeType;
	private List<Student> studentList;
	
	public Subject(int subId, String subName) {
		this.subId = subId;
		this.subName = subName;
	}
	
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public int getGradeType() {
		return gradeType;
	}
	
	
	
}
