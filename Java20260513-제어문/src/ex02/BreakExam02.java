package ex02;

public class BreakExam02 {

	public static void main(String[] args) {
/*
 * 1부터 1식 하는 수를 sum에 누적한다
 * 단, sum 이 10000되는 순간에 
 * i 값과 sum을 출력
 */
		int i = 0;
		int sum = 0;

		while (true) {
			i++;
			sum += i;
			System.out.println("i값 " + i +" 현재 누적값 : " + sum);
			
			if (sum > 10000) {
				break;
			}
			//System.out.println("i값 " + i +" 현재 누적값 : " + sum);
		}
	}

}
