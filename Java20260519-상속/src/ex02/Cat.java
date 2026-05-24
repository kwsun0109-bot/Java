package ex02;

public class Cat extends Animal {
		
	public Cat(String name) {
		super(name);
	}
	
	void meow() {
		System.out.println(getName() + " 이가 야옹한다.");
	}
	
}
