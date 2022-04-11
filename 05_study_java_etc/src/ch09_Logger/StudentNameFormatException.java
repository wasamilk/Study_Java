package ch09_Logger;

public class StudentNameFormatException extends IllegalArgumentException{
	
	public StudentNameFormatException(String message){
		super(message);
	}
}