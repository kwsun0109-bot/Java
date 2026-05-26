package ex01;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while (true) {
			if ((num2 == 0) || (num2 == ' ')) {
				System.out.println("0을 제외한 정수를 재입력하세요.");
				num2 = sc.nextInt();
			} else {
				break;
			}
		}
		System.out.println("나누기 결과 : " + num1/num2);
		System.out.println("프로그램 종료");

		sc.close();
	}

}
