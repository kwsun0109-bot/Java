package ex01;

public class BoxMain {
	/*
	제네릭은 타입을 정하지 않고 필요할때 데이터 타입을 지정해서 사용하는 기능
	 */


	public static void main(String[] args) {
		Car c = new Car();
		c.func();

		Box b = new Box();
		b.setItem("가장자리에서 중심으로...");
		System.out.println("Bus class : " + b.getItem());
		
	}
}

class Car{
	void func() {
		System.out.println("Car 메소드 출력");
	}
}

class Box{
	Object item;
	
	void setItem(Object item) {
		this.item = item;
	}
	
	Object getItem() {
		return item;
	}
}