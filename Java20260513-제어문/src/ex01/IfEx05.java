package ex01;
//import java.util.Scanner;

/*
 * 1. 조건식이 참이면 문장을 실행
 *    if(조건식)
 *      문장;
 *      
 * 2. 조건식이 참이면 문장1을 실행 거짓이면 문장2를 실행
 *    if(조건식)
 *      문장1;
 *    else
 *      문장2;
 *      
 * 3. 조건식1이 참이면 문장1을, 조건식2가 참이면 문장2를 그 외는 문장3 실행
 *    if(조건식1)
 *      문장1;
 *    else if(조건식2)
 *      문장2;
 *    else
 *      문장3;   
 */    

public class IfEx05 {

	public static void main(String[] args) {
		
	/* 
	 * 국어, 영어 점수가 각각 60점 이상이면 합격
	 * 아니면 불합격
	 * 
	 * 중첩 if문
	 */

		int kor = 80;
		int eng = 87;
		
		if (kor >= 60) {
			if (eng >= 60)
				System.out.println("합격 입니다");
			else
				System.out.println("불합격 입니다.");
		}
		else
		    System.out.println("불합격 입니다.");
		
		System.out.println("프로그램 종료!");
	}

}
