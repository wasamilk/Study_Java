package ch05_ReferenceDataType;

public class Student {

	int stdId;
	String stdName;
	
	Subject korea;
	Subject math;
	
	Student(int stdId, String stdName){
		this.stdId = stdId;
		this.stdName = stdName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSub(String name, int score) {
		korea.subName = name;
		korea.score = score;
	}
	
	public void setMathSub(String name, int score) {
		math.subName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(stdName + "의 총점 : "  + total );
	}
}
