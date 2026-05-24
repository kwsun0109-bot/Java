package ex01;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*
		 * 5명 학생 국어 점수를 입력받아서 출력
		 */
		
		int[] kor = new int[5];
		
		
		for(int i=0; i<kor.length; i++)
			kor[i] =  (int)(Math.random()*100) + 1; //1~100
		
		for(int i=0; i<kor.length; i++)
			System.out.println((i+1) + "번째 학생 : " + kor[i]);
		
		
				
	}

}
