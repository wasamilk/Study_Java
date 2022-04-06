package ch08_This;

public class Person {

	String name;
	int age;
	
	public Person() {
		// name = "test"   //-> 생성자 호출 이전에 다른것 호출은 에러
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person);
		System.out.println(person.getPerson()); // 생성된 객체와 this는 같은 메모리 주소값을 리턴한다.
	}
}
