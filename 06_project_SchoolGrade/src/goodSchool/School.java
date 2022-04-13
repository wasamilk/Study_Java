package goodSchool;

import java.util.ArrayList;
import java.util.List;

// 
public class School {

	private static School instance =  new School();
	private List<Subject> subList = new ArrayList<>();
	private List<Student> stdList = new ArrayList<>();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	public List<Subject> getSubList() {
		return subList;
	}

	public void setSubList(List<Subject> subList) {
		this.subList = subList;
	}

	public List<Student> getStdList() {
		return stdList;
	}

	public void setStdList(List<Student> stdList) {
		this.stdList = stdList;
	}

	@Override
	public String toString() {
		return "School [subList=" + subList + ", stdList=" + stdList + "]";
	}
	
	
	
}
