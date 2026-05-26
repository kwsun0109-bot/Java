package ex01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayEx04 {

	public static void main(String[] args) {
	
		/*
		 * 10개의방에 임의수를 넣어
		 * 최대, 최소값을 구하고
		 * 총합, 평균을 구하시오.
		 * sort 하기
		 */	
		
		int [] bang = new int[10];  // 선언부, 생성부 기본 초기화 int 0, string null 값이 초기화됨
		
		// 임이의수 10개 저장 ---------------------------------------------------------------
		for (int i=0; i<bang.length; i++) { 
			bang[i] = (int)(Math.random()*100)+1;
			System.out.print(bang[i] + " ");
		}
		
		System.out.println();
		
		//최대, 최소 값구하기 ---------------------------------------------------------------
		int max = bang[0];
		int min = bang[0];
		
		for (int i=0; i<bang.length; i++) {
			if (max < bang[i]) {
				max = bang[i];
			}
			else if (min > bang[i]) {
			         min = bang[i];
			}
		}
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
		// 총점 , 평균값 구하기 --------------------------------------------------------------
		int sum = 0;
		double avg = 0;
		
		for (int i=0; i<bang.length; i++) {
			sum += bang[i];  // sum = sum + bang[i];
		}
		avg = sum / (double)bang.length;
		System.out.println("총합: " + sum + ", 평균: " + avg);
		
		// sort -------------------------------------------------------------------------
//		Arrays.sort(bang);
//		for (int i=0; i<bang.length; i++) {			
//			System.out.print(bang[i] + " ");
		
		int temp = 0;
//		int [] temp = {0}; //new int[1];
		
		for (int i=0; i<bang.length; i++) {
			for (int j=0; j<bang.length-1; j++) {
				if (bang[j] > bang[j+1]) {					
					temp      = bang[j];
					bang[j]   = bang[j+1];
					bang[j+1] = temp;						
				}
			}
		}
		for (int i=0; i<bang.length; i++) 			
			System.out.print(bang[i] + " ");
			
		// ------------test ------------------------
		System.out.println();
		
		System.out.println("합 :" + Arrays.stream(bang).sum());
//		OptionalDouble avg = Arrays.stream(bang).average();
//		System.out.println("평균 : " + avg);		
	}
}
