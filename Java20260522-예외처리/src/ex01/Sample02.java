package ex01;

import java.util.Scanner;

public class Sample02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 이름 입력 : ");
		
		int age = sc.nextInt();
		sc.nextLine();
		String name =  sc.nextLine();
		
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
