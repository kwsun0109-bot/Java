package ex06;

public class Main {

	public static void main(String[] args) {

	Animal a1 = new Animal(); //fa(), test()-A
	Animal a2 = new Cat();	  //fa(), test()-B
	Animal a3 = new Dog();    //fa(), test()-C
	a1.fa();
	a2.fa();
	a3.fa();
	a1.test();
	a2.test();
	a3.test();
	System.out.println("-----");
	
//	Cat c1 = new Animal();  error
	Cat c2 = new Cat();       // fa(), fc(), test()-B
	Cat c3 = new Dog();       // fa(), fc(), test()-C
	c2.fa();
	c3.fc();
	c2.test();
	c3.test();
	System.out.println("-----");
	
//	Dog d1 = new Animal();    error
//	Dog d2 = new Cat();       error
	Dog d3 = new Dog();       // fa(), fc(), fd(), test()-C
	d3.fa();
	d3.fc();
	d3.fd();
	d3.test();

	}

}
