package ch11_SingletonPattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		// java util의 대표적인 싱글톤패턴 클래스 Calender
		//Calendar calendar = new Calendar();
		Calendar calendar =Calendar.getInstance();
		System.out.println(calendar);
		
	}
}
