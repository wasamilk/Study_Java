package ch06_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// sorted -> 요소들을 정렬해주는 작업을 해줍니다.
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// map -> 요소들을 특정조건에 해당하는 값으로 변환해 줍니다.
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n+ "       "));
		System.out.println();
		
		// filter -> 요소들을 조건에 따라 걸러내는 작업을 해줍니다.
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + " "));

	}
}
