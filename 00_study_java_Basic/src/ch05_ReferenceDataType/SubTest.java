package ch05_ReferenceDataType;

public class SubTest {
	
	public static void main(String[] args) {
	
		Student lee = new Student(1, "lee");
		lee.setKoreaSub("국어", 24);
		lee.setMathSub("수학", 67);

		lee.showScoreInfo();
	}

}
