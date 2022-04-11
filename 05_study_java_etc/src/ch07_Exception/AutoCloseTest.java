package ch07_Exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();

		// 자바 9버전부터 나온거라 오류가난다. 
		// 암튼 try문이든 catch문으로 떨어지든 close()메서드가 불린다.
/*		try (obj) {
			// throw new Exception();
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("end");
*/
	}
}
