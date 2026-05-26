package ex02;

public class WhileEx03 {

	public static void main(String[] args) {
	
		int i=2; // 단 2~5
		int j=1; // 1~9
		
		while(i<=5) {
			while(j<=9) {
				System.out.println(i + " x " + j + " = " + i*j);
				j++;
			}
			i++;
			j=1; // for문과는 다르게 while문에서는 초기화가 중요...
			System.out.println();
		}
		System.out.println("시스템 종료");
	}

}
