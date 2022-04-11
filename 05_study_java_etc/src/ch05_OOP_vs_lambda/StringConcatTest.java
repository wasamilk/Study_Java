package ch05_OOP_vs_lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "world";
			
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		// 람다식으로 작성하면 내부적으로 익명내부클래스를 생성해준다. -> 이를 통해 익명 객체가 생성
		// 자바에서는 객체 없이 메서드가 호출 될 수 없음..
		StringConcat concat = (str1, str2) -> System.out.println(str1 + "," + str2);
		concat.makeString(s1, s2);
	}
}
