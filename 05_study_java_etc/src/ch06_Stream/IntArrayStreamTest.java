package ch06_Stream;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int i : arr) {
			//System.out.println(i);
		}
		
		// 정수배열의 스트림객체 생성하면 IntStream을 반환.. IntStream에서 forEach 수행...
		// 스트림객체는 일회용. 재활용 불가. 변수로 선언해놨어도 한번 쓰면 사라짐.
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		//스트림은 중간연산과 최종연산으로 나뉘며, 최종연산이 호출되어야 중간연산이 수행되는 지연연산이다
		// 중간연산 ex) filter(), map(), sorted()
		// 최종연산 ex) forEach(), count(), sum()
		
	}
}
