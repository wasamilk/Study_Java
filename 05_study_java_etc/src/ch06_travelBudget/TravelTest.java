package ch06_travelBudget;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
		System.out.println("\n여행경비");
		System.out.println(customerList.stream().mapToInt(s->s.getPrice()).sum());
		
		System.out.println("\n20살 이상 고객 정렬해서 출력");
		// 중간연산은 여러개 가능, 최종연산은 한번만
		customerList.stream().filter(s-> s.getAge()>=20).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
	}
}
