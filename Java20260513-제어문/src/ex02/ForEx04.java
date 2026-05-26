package ex02;
/*
 * 구구단
 */

public class ForEx04 {

	public static void main(String[] args) {
		
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j + "\t");
				// System.out.printf("%d * %d = %d\t", j , i, j * i);
			}
			System.out.println();
		}
		
	}

}
