package ex11;

public class Parent {
	
	Parent() {}
	
	Parent(String name){
		System.out.println("부모 생성자 " + name);
	};
	
	int value = 10;
	public void show() {
		System.out.println("부모의 show() 호출");
	}

}
