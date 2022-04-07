package ch03_String;

public class StringTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");

		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		// str연결시 새로운 memory를 차지함.
		System.out.println(System.identityHashCode(java));
		
		String ori1 = "abc";
		String ori2 = "ef";
		String ori3 = "abcef";
		
		// 상수풀에서 가져왔다해도 문자열 연결하면 새로운객체로 생성됨....
		ori1 = ori1.concat(ori2);
		System.out.println(ori1);
		System.out.println(ori3);
		System.out.println(System.identityHashCode(ori1));
		System.out.println(System.identityHashCode(ori3));
		
	}
}
