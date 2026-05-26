package ex02;
/*
 * 구구단
 */

public class ForEx03 {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				if (j == i)
					break;
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if (i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
