package ex11;

public class Child extends Parent{
	
	Child() {}
		
	Child(String name) {//생성자는 타입과 관련없음. 있으면 error
		super(name);
		System.out.println("자식 생성자 " + name);	
	}

	int value = 20;
	public void show() {
		super.show();
		System.out.println("자식의 show() 호출");
		System.out.println("부모 vlaue = " + super.value);
		System.out.println("자식 vlaue = " + this.value);
	}
}
