package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl r1 = new TV();
		RemoteControl r2 = new Audio();
		
		r1.powerOn();
		r1.powerOff();
		
		r2.powerOn();
		r2.powerOff();
	}
	
	/* 추상클래스는 객체를 직접생성할 수 없고, 하위 클래스가 반드시 구현해야 하는 추상 메서드를 포함한 클래스입니다
	   공통 속성이나 기능은 미리 구현해 둘 수 있으며, 상속 구조를 명확히 하여 코드 재사용성과 일반성을 보장합니다
	   추상클래스는 (abstract) 키워드를 사용하여 정의하며, 추상 메서드가 하나이상 클래스네에 포함되면 반드시 
	   추상클래스가 되어야 함. 또한 생성자는 존재할 수 있지만, 직접 객체를 생성할 수는 없다.
	   
	   인터페이스 : interface 키워드를 사용하며, 클래스는 implements를 통해 이를 구현합니다. 
	   인터페이스에 선언된 메서드는 기본적으로 public abstract 속성을 가집니다.
	   
	*/
}
