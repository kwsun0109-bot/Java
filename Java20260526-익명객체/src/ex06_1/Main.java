package ex06_1;

@FunctionalInterface // 추상메서드가 1개만 존개
interface Calculable {
	void calculable(int x, int y);
}

public class Main {

	public static void main(String[] args) {
	
		Calculable cal = (x, y) -> System.out.println(x+y);
		cal.calculable(5,6);
	}
}
