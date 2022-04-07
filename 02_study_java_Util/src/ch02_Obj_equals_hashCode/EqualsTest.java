package ch02_Obj_equals_hashCode;

public class EqualsTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "lee");
		Student std2 = new Student(100, "lee");
		
		// == : 주소값으로 비교
		System.out.println(std1==std2); 
		// equals() 출력(origin) : false -> 주소값으로 비교
		// equals() 출력(override) : true -> 학생번호로 비교하도록 오버라이딩
		System.out.println(std1.equals(std2));
		
		/**=========================================================================
		 * equals()만 오버라이딩하면 true가 나와도 hashCode()는 원래는 객체의 주소값이 나오므로 false
		 * 따라서, equals() 오버라이딩하면 hashCode()또한 논리적으로 같게 나오도록 오버라이딩해야함.
		 * =========================================================================*/
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(std1.hashCode()==std2.hashCode());
		
		//int java.lang.System.identityHashCode(Object x) -> 진짜 주소값을 반환해주는 메서드
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		
		/**=========================================================================
		 * clone()만 오버라이딩하면 CloneNotSupportedException
		 * 오버라이딩 한 클래스에서 implements Cloneable 명시적으로 해줘야함
		 * =========================================================================*/
		Student copyStd = (Student)std1.clone();
		System.out.println(copyStd);
		std1.setNum(200); //원본이 바뀐다고 복사본까지 바뀌지는 않음. 복사본은 새로운 객체임
		System.out.println(copyStd);
		
		
		
	}
}
