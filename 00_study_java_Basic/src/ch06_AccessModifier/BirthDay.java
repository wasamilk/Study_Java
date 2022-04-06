package ch06_AccessModifier;

public class BirthDay {

	// 유효하지 않은 값의 set을 막기 위해 private해놓고, 멤버변수 제어는 게터세터를 사용한다.
	// 정보은닉 .. 이라기보다 정보의 보호이다.
	// getter만 있을 경우 read-only라고 할 수 있따.
	private int day;
	private int mon;
	private int year;

	private boolean isValid; // boolean default -> false

	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		if (mon<1 || mon>12) {
			isValid=false;
		}else {
			isValid=true;
			this.mon = mon;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if (isValid)
			System.out.println(year + "-" + mon + "-" + day);
		else
			System.out.println("X");
	}

}
