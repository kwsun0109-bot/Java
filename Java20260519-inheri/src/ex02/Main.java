package ex02;

public class Main {

	public static void main(String[] args) {

		Dog d = new Dog("로이");
		d.eat();
		d.sleep();
		d.back();
		
		System.out.println();
		
		Cat c = new Cat("제니");
		c.eat();
		c.sleep();
		c.meow();
	}

}
