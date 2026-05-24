package ex10;

public class Person {

	private String name;
	
	Person() {
		
	}
	
	Person(String name) { 
		this.name = name; 
	}
	
//	public String getInfo() { 
//		return name; 
//	} 
	
	@Override
	public String toString() {
		return name;
	}
}
