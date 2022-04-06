package ch11_SingletonPattern;

public class Company {

	// 유일한 객체
	private static Company instance = new Company();
	
	// default constructor는 public이므로 private로 다시 선언해서 인스턴스 생성을 막아줌.
	private Company() {}
	
	// 객체에 접근할 수 있도록 해주는 메소드
	// 일반 메소드면 객체를 생성했을때만 호출 가능하므로, static으로 메소드를 선언한다.
	public static Company getInstance() {
		// null일리는 없지만 혹시 모르니 넣는다.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
