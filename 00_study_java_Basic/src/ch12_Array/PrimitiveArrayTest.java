package ch12_Array;

public class PrimitiveArrayTest {

	public static void main(String[] args) {
		//선언만 하면 초기화되어있음. 지역변수여도 배열로 선언하면 자동으로 초기화됨.
		int[] arr1 = new int[10]; 		// {0, 0,,, 0}
		
		int total = 0;
		
		// [ i<=9 ]는 0~9까지이지만 10개를 나타냄. 직관적이지 않음. 
		// 따라서 [ i<10 ]을 많이 사용함
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = i;
		}
		
		//for(int num : arr1){} -> 향상된 for문
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
			total += arr1[i];
		}
		System.out.println(total);
		
	}
}
