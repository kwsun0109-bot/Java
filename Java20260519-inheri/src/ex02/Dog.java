package ex02;

public class Dog extends Animal {
	
	public Dog(String name) {
		// 상위 클래스 생성자를 통해서 값을 전달
		super(name);
	}
	
	public Dog() {
		
	}	
	
	void back() {
		System.out.println(getName() + "가 멍멍 짓는다");
	}
}
