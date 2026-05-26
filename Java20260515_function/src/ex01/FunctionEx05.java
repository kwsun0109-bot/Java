package ex01;

import java.util.Scanner;

public class FunctionEx05 {
	
	/*
	 * 함수
	 * 두 정수를 입력받아서, 합을 구하는 예제
	 * 3. 전달하는 값 없음, 반환값은 있는 경우
	 * 
	 */

	public static void main(String[] args) { // void 타입은 반환값이 없다.
		
		int result = add();
		System.out.println("두수의 합 : " + result);
//		System.out.println("두수의 합 : " + add());
		
	}
	
	static int add() {
		
		int a = 5;
		int b = 2;
		
		return a+b;
		
	}
	
	
}
