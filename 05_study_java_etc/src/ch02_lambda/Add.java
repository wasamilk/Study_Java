package ch02_lambda;

/**  함수형 인터페이스 
 * @FunctionalInterface 
 * Functional Interface는 일반적으로 '구현해야 할 추상 메소드가 하나만 정의된 인터페이스'를 가리킵니다. 
 * */ 
public interface Add {
	
	public int add(int x, int y);

}


/**
 * // 기존의 익명함수 
 * System.out.println(new MyLambdaFunction() { 
 * 		public int max(int a, int b) { 
 * 			return a > b ? a : b; 
 * 		} 
 * }.max(3, 5));

 *  // 함수형 인터페이스와 람다식을 이용한 익명함수 
 * @FunctionalInterface 
 * interface MyLambdaFunction {
 * 		 int max(int a, int b); 
 *  } 
 *  
 * MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b; 
 * System.out.println(lambdaFunction.max(3, 5)); 
 */