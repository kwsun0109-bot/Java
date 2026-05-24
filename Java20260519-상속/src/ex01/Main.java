package ex01;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.sleep();
		d.eat();
		//d.bark();
		
		Cat c = new Cat();
		//c.meow();
		c.eat();
		c.sleep();

		Animal aaa = new Cat();
		aaa.meow();

		Animal bbb = new Dog();
		bbb.meow();
	}
	
}
