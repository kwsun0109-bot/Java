package ex01;

import java.util.Scanner;

public class FunctionEx06 {
	
	/*
	 * 함수
	 * 두 정수를 입력받아서, 합을 구하는 예제
	 * 4. 전달하는 값 없음, 반환값도 없는 경우
	 * 
	 */

	public static void main(String[] args) { // void 타입은 반환값이 없다.
		
		add();  // 함수 호출
	
	}
	
	static void add() {
		
		int a = 5;
		int b = 2;
		
		int sum = a + b;
		
		System.out.println("두수의 합 : " + sum);

	}
	
	
}
