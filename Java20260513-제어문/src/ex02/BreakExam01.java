package ex02;

public class BreakExam01 {

	public static void main(String[] args) {
/*
 * 주사위 던지기 게임
 * 주사위를 던져서 누적해서 합이 높은 사람이 승자
 * 단, 주사위 6이 나오면 게임 종료
 */
		int sum = 0;
		// 1 ~ 6 사이의 랜덤 숫자 생성
		while (true) {
			int i = (int)(Math.random()*6)+1;
			sum += i;
			if (i == 6) {
				System.out.println("주사위 " + i + " 게임 종료");
				break;
			}
			System.out.println("주사위 " + i + " 현재 누적값 : " + sum);
		}
	}

}
