package ch02_Obj_equals_hashCode;

public class Student implements Cloneable{

	private int num;
	private String name;

	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.num==std.num)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return num;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
	
}
