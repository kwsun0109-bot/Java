package ex07;

import java.util.Scanner;

/*
 * 클래스를 설계한다
 * 함수 1개 생성
 * 함수는 정수를 입력받아서 2의 배수이면 true 아니면 false를 출력한다
 * 클래스 설계 후 함수를 호출해서 정수값을 전달한뒤, 반환 결과를 출력하는 프로글램
 */
@FunctionalInterface // 추상메서드가 1개만 존개
interface Calculable {
	int calculable(int x);
}

class Calcul implements Calculable {
	@Override
	public int calculable(int x) {
		return x;
	}
}

public class PredicateMain {

	public static void main(String[] args) {

		System.out.print("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		Calculable cal = new Calcul();
		int result = cal.calculable(i);

		if (result % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
