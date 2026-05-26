package ex01;

import java.util.Scanner;

public class FunctionEx04 {
	
	/*
	 * 함수
	 * 두 정수를 입력받아서, 합을 구하는 예제
	 * 2. 전달하는 값(인자, 매개변수), 반환값은 없는 경우
	 * 
	 */

	public static void main(String[] args) { // void 타입은 반환값이 없다.
			
		double a = 1.2;
		double b = 2.5;

		FunctionEx04 f4 = new FunctionEx04();
		f4.add(a, b);
		
	}
	
	void add(double num1, double num2) {
		
		double sum = num1 + num2;
		System.out.println("두수의 합 : " + sum);
		return; // 생략가능
//		return sum; "Void methods cannot return a value" error 발생
		
	}
	
	
}
