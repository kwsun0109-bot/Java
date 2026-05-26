package ex02;

public class ContinueEx01 {
	
	/*
	 *  1~10까지 3의 배수를 출력 하지 않는다
	 */
	
	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			if (i%3 != 0) {
				System.out.printf("%d ", i);
			}
		}	
		System.out.println();
		
		for (int j=1; j<=10; j++) {
			if (j%3 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
	}
}
