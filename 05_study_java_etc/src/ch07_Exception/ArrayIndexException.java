package ch07_Exception;

public class ArrayIndexException {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		
		try {
			for(int i=0; i<=5; i++) {	//java.lang.ArrayIndexOutOfBoundsException
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.print("printStackTrace : ");e.printStackTrace();
		}
	}
}
