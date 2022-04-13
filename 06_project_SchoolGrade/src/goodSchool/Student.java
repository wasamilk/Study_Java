package goodSchool;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String stdName;
	private int stdId;
	private Subject major;
	private List<Score> scoreList;
	
	
	public Student(String stdName, int stdId, Subject major) {
		this.stdName = stdName;
		this.stdId = stdId;
		this.major = major;
		this.scoreList = new ArrayList<>();
	}

	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public Subject getMajor() {
		return major;
	}
	public void setMajor(Subject major) {
		this.major = major;
	}
	public List<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<Score> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", major=" + major + ", scoreList=" + scoreList
				+ "]";
	}
	
	 
}
