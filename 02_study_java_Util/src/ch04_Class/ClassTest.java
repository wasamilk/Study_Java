package ch04_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		System.out.println(c);
		
		// 생성자 반환
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		// 메소드 반환
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
		
	}
}
