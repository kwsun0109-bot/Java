package ex01;

import java.util.Scanner;

public class FunctionEx03 {
	
	/*
	 * 함수
	 * 두 정수를 입력받아서, 합을 구하는 예제
	 * 1. 전달하는 값(인자, 매개변수), 반환하는 값
	 * 
	 */

	public static void main(String[] args) { // void 반환타입은 반환값이 없다.

//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 수를 입력 : ");
//		int a = sc.nextInt();
//		System.out.print("두 번째 수를 입력 : ");
//		int b = sc.nextInt();
				
		int a = 3;
		int b = 2;
		
//		FunctionEx03 f3 = new FunctionEx03();
//		f3.add(a , b);

		int total = add(a,b);  // a, b 는 매개변수, 함수호출
		System.out.println("덧셈 : " + total);
		
	}

	// int total, int sum, int add() type이 같아야 함.
	
	static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum; // 결과값을 호출한 곳으로 반환 함.
		
	}
	
	
}
