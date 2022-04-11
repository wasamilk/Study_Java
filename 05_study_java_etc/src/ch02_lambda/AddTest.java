package ch02_lambda;

public class AddTest {

	public static void main(String[] args) {
		
		// 람다식은 함수형 인터페이스를 반환한다.
//		Add addL = (x, y)->{return x+y;};  
		Add addL = (x, y)-> x+y; // return 및 중괄호 생략가능  
		System.out.println(addL.add(2, 3));
	}
}
