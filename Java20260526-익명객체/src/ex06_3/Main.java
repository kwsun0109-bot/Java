package ex06_3;

@FunctionalInterface // 추상메서드가 1개만 존개
interface Calculable {
	int calculable(int x, int y);
}

public class Main {

	public static void main(String[] args) {
	
		/*
		 * 람다식에서 return 이 있는 경우는 중괄호 생략 불가
		 * return 이 포함된 중괄호에서 문장이 한 문장이면 return 문 생략 및 중괄호도 생략 가능
		 */
		
		Calculable cal = (x, y) -> x+y;
	
		int result = cal.calculable(5,6);
		System.out.println(result);
	}
}
