package ex06;

public class Main {
	public static void main(String[] args) {
		
		A a1 = new A(); //fa(), test()-A
		A a2 = new B(); //fa(), test()-B
		A a3 = new C(); //fa(), test()-C
		a1.fa();
		a1.test();
		a2.fa();
		a2.test();
		a3.fa();
		a3.test();
		System.out.println("==============================");
		//B b1 = new A() error
		B b2 = new B(); //fa(), fb(), test-B
		B b3 = new C(); //fa(), fb(), test-C
		b2.fa();
		b2.fb();
		b2.test();
		b3.test();
		System.out.println("==============================");
		//C c1 = new A() error
		//C c2 = new B() error
		C c3 = new C(); //fa(),fb(),fc() ,test-C
		c3.fa();
		c3.fb();
		c3.fc();
		c3.test();
	}
}
