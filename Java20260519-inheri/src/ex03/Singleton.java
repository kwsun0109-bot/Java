package ex03;

/*
 * 싱글톤 - 객체 생성을 1개만 생성해서 공유한다
 */

public class Singleton {
	
	private String name;
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {	
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
