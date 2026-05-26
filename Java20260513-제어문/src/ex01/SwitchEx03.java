package ex01;

public class SwitchEx03 {
	public static void main(String[] args) {
/*		
		int jumsu = 95;
		
		if (jumsu >= 90)
			System.out.println("A학점");
		else if(jumsu >= 80)
			System.out.println("B학점");
		else if(jumsu >= 70)
			System.out.println("C학점");
		else if(jumsu >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

		System.out.println("프로그램 종료!");
*/		
		
		/*
		 * switch 문
		 */
		int jum = (int)(Math.random() * 100) + 1;
		System.out.println("점수는 : " + jum);
		int jumsu = (int)(jum / 10);
		
		switch(jumsu) {
			case 10,9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			case 5:
				System.out.println("E학점");
				break;
			default:
				System.out.println("F학점");

		}
				
		System.out.println("프로그램 종료!");
	}
}
