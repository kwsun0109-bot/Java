package ex04;

public class TestMain {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.walk();
		Walkable.info();  // 인스턴스 참조변수(c)로 Walkable의 메서드인 info()를 호출할 수 없다

	}

}


interface Walkable { //인터페이스는 추상메서드의 집합이다.
	default void walk() {
		System.out.println("Walking on the ground.");
	}
	static void info() {
		System.out.println("Walkable entities can move on land.");
	}
}

class Cat implements Walkable {}
// 추상 클래스는 상속관계에서 공통된 속성과 기본동작을 제공하는 데 적합하고,
// 인터페이스는 클래스간의 기능적 규약을 공유하는 데 적합하다.
// 즉, "is-a 관계이면 추상클래스, "can-do"관계이면 인터페이스를 선태하는 것이 일반적임.
// 추상클래스(추상메서드, 일반메서드), 인터페이스(추상, default, static 메서드)
// 속성과 메서드를 함께 제공해야 한다면 추상클래스사용
// 서로 다른 클래스에 동일한 행동 규약을 부여해야 한다면 인터페이스 사용

