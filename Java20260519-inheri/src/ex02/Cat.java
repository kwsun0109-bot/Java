package ex02;

public class Cat extends Animal {
	
	public Cat(String name) {
		// 상위 클래스 생성자를 통해서 값을 전달
		super(name);
	}
	
	public Cat() {
		
	}
	
	void meow() {
		System.out.println(getName() + "가 야옹 한다");
	}
}
