package ex06;

public class Cat extends Animal {
	
	void fc() {
		System.out.println("fc");
	}
	/*
	 * 상위클래스에 있는 메서드를 하위클래스가 다시 작성하는 것을
	 * 메서드 오버라이딩이라고 한다
	 * 상위클래스에 있는 메서드를 하위클래스가 재 작성하는것을 메서드 재정의라고 부른다
	 */
	@Override //@ 어노테이션
	void test() {
		System.out.println("B Class..");	
	}
}
