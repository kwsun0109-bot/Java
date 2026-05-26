package ex02;
/*
 * 반복문
 * 1. for
 * 2. while
 * 3. do~while
 * 
 * for, while -> 조건이 참이면 실행, 거짓이면 실행 안함
 * for 문은 회전하는 횟수를 알때, while문은 알지 목할때 사용한다.
 * do~while -> 최소 1번을 실행보장(거짓이여도 한번은 실행)
 * 
 * for : 
 * 
 * for(초기값; 조건; 증가값)
 * 		조건을 만족하면 실행될 코드(문장)
 * 
 * 실행순서 :
 * 1회전 : 초기값 -> 조건 -> 문장 -> 증가값
 * 2회전 이후:
 * 조건 -> 문장 -> 증가값; 반복(조건을 만족할 동안)
 * 
 */

public class ForEx01 {

	public static void main(String[] args) {
		
		//1 ~ 5 까지의 합
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.println(i + " 합 : " + sum);
		}
		System.out.println();
		System.out.println("총합 : " + sum);
	}

}
