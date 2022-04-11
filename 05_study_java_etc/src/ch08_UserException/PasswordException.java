package ch08_UserException;

// 어떤 에러 상속받을 지 모르면 그냥 Exception 상속받아도 됨
public class PasswordException extends IllegalArgumentException{
	
	public PasswordException(String message) {
		super(message);
	}
}
