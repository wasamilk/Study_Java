package ch03_Class;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showSudentInfo() {
		System.out.println(studentID + "학번의 이름은 " + studentName + " 이고, 주소는 " + address + "입니다. ");
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
