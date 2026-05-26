package ex01;

public class ArrayEx03 {

	public static void main(String[] args) {
	
		/*
		 * 로또 번호 출력
		 */

		
		int [] lotto = new int[6];
		
		System.out.print("로또번호" + " ");
		
		for (int i=0; i<lotto.length; i++) { 
			lotto[i] = (int)(Math.random()*45)+1;
			
			// 중복제거
			for (int j=0; j<i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					continue;
				}
			}

		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
