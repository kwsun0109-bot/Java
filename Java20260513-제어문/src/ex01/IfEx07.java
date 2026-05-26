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

public class IfEx07 {

	public static void main(String[] args) {
		
		/*
		 * 버스요금 계산표
		 * 요금 : 2000
		 * 65세 이상 : 무료
		 * 20 ~ 64 : 할인율 0%
		 * 15 ~ 19 : 할인율 20%
		 * 7 ~ 14 : 할인율 50%
		 * 6 미만 : 무료
		 * 
		 * 출력 예시
		 * 나이 xx는 xx요금 입니다.
		 */
		
		int age = 77;
		int fee = 2000;
		double rate = 0; 
		
		if (age >= 65) {
			fee = 0;
		}
		else if (age >= 20 && age <= 64) {
			rate = 0;
		}
		else if (age >= 15 && age <= 19) {
			rate = 0.2;
		}
		else if (age >= 7 && age <= 14) {
			rate = 0.5;
		}
		else
			fee = 0;
		
		if (fee != 0) {
			fee = (int)(fee *(1-rate));
		}
	
		System.out.println("나이 " + age + "는 " + fee + " 요금 입니다.");
		
		System.out.println("프로그램 종료!");
	}
}
