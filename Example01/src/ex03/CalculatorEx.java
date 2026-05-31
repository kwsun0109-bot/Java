package ex03;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator ca = new Calculator();
		double a = ca.areaRectangle(10);
		double b = ca.areaRectangle(10, 20);
		
		System.out.println(a);
		System.out.println(b);
	}

}
