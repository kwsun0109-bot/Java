package ex06_2;

@FunctionalInterface // 추상메서드가 1개만 존개
interface Calculable {
	int calculable(int x, int y);
}

public class Main {

	public static void main(String[] args) {
	
		Calculable cal = new Calculable() {
			
			@Override
			public int calculable(int x, int y) {
				return x+y;
			}
		};
		int result = cal.calculable(5,6);
		System.out.println(result);
	}
}
