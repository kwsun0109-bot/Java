package ex04;

class A{
	void fa() {}
	
	void test() {
		System.out.println("A class");
	}
}

class B extends A{
	void fb() {}
	
	void test() {
		System.out.println("B class");
	}
}

class C extends B{
	void fc() {}
	
	void test() {
		System.out.println("C class");
	}
}
public class Main {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();   // 다형성과 동적바인딩
		A a3 = new C();
		
		a1.fa();
		a1.test();
		
		a2.fa();
		a2.test();
		
		a3.fa();
		a3.test();
		
		B b1 = (B)a2;
		b1.fa();
		b1.fb();
		b1.test();
		
		C c1 = (C)a3;
		c1.fa();
		c1.fb();
		c1.fc();
		c1.test();
		
		// 오버라이딩(override) 부모-자식 간의 관계에서 발생하는 재정의(implement)이며, 오버로딩(overloading)은 같은 클래스 내에서의 중복 정의입니다.
		// 하나의 참조변수가 다양한 실제객체를 참조할 수 있는 성질을 말한다.
		// 상속과 오버라이딩을 기반으로 실행 시점에서 객체의 실제 타입에 따라 호출되는 메서드가 달라지는 동적 바인딩이 이루어 진다.
		// 이를 통해 코드의 재사용성과 확장성이 향상되며, 프로그램 구조가 유연해 진다.
		// 프로그램이 실행중에 메서드가 결정되는것을 동적 바인딩 이라한다.
	}

}

























