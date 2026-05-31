package ex02;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.setGas(100);
		
		if (myCar.isLeftGas()) {
			System.out.println("출발");
			myCar.run();
		}
		System.out.println("gas를 넣어주세요");	

	}

}
