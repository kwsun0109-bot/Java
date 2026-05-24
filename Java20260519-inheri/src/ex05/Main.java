package ex05;

public class Main {

	public static void main(String[] args) {

	Animal a1 = new Animal(); //fa()
	Animal a2 = new Cat();	  //fa()
	Animal a3 = new Dog();    //fa()
	a1.fa();
	a2.fa();
	a3.fa();
	System.out.println("-----");
	
//	Cat c1 = new Animal();  error
	Cat c2 = new Cat();       // fa(), fc()
	Cat c3 = new Dog();       // fa(), fc()
	c2.fa();
	c2.fc();
	System.out.println("-----");
	
//	Dog d1 = new Animal();    error
//	Dog d2 = new Cat();       error
	Dog d3 = new Dog();       // fa(), fc(), fd()
	d3.fa();
	d3.fc();
	d3.fd();
	}

}
