package ch06_AccessModifier;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setDay(20);
		date.setMon(11);
		date.setYear(2022);
		
		date.showDate();
	}

}
