package ch06_Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
/**
 * T reduce(T identity, BinaryOperator<T> accumulator)
 * */
// reduce는 직접 정의한 함수를 쓸 수 있는데, 람다식으로 표현하기 너무 길 경우엔 
// 아래처럼 BinaryOperator를 imple 후 apply 메소드를  오버라이딩해서 쓴다.
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)-> 
		                          {if (s1.getBytes().length >= s2.getBytes().length) 
				                                  return s1;
		                          else return s2;})); 
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator를 구현한 클래스 이용
		System.out.println(str);
		                          
	}
}