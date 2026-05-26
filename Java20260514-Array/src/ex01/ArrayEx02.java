package ex01;

public class ArrayEx02 {

	public static void main(String[] args) {
	
		/*
		 * 5명의 학생의 국어점수를 입력받아서 출력
		 */
		
		//int [] kor;
		//kor = new int[5];
		
		int [] kor = new int[5];
		int sum = 0;
		
		for (int i=0; i<kor.length; i++) {
			kor[i] = (int)(Math.random()*100)+1; 
			System.out.println((i+1) + "번째 학생 : " + kor[i]);
			sum += kor[i];
		}
		// 5명 학생 총점 구하기
		System.out.println("학생의 총점은 : " + sum);
		
	}

}
