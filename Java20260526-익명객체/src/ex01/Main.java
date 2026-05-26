package ex01;

interface Animal{
	void sound();
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("멍멍~");
	}
}

class Cat implements Animal {
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}

public class Main {

	public static void main(String[] args) {
	
		Animal an = new Dog(); // <-- "new Dog" 구현체만 올수있음....
		an.sound();
		
		Animal an1 = new Cat();
		an1.sound();

	}

}
