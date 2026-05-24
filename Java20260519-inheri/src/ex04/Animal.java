package ex04;

public class Animal {
	
	private String name;
	
	public Animal() {
		
	}
	
	String getName() {
		return name;
	}
	
	public Animal (String name) {
		this.name = name;
	}
	void eat() {
		System.out.println(name + " 밥을 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}

}
