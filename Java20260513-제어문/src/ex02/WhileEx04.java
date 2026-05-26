package ex02;

public class WhileEx04 {

	public static void main(String[] args) {
	
		int number = 1;
		do {
			System.out.println("dowhile " + number);
			number++;
		}
		while (number>3);
		System.out.println("시스템 종료");
		
		
		int number1 = 1;
		while (number1>3) {
			System.out.println("while " + number1);
			number1++;
		}
		System.out.println("시스템 종료1");
	}

}
