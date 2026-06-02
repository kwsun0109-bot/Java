package ex12;

public class InnerExample {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car.Engine engine = c.new Engine(); // <--  비정적 중첩 클래스(Inner Class)
		engine.start();
		
	}

}

class Car {
	private String model = "Avante";
	
	class Engine {
		void start() {
			System.out.println(model + " 엔진이 시동됩니다.");
		}
	}
}
