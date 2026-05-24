package ex01;

public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog 객체 생성");
	}

	@Override
	void  meow() {
		System.out.println("가 멍멍 짓는다");
	}
}
