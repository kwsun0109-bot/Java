package ex08;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person ("싸이", 15);
		Person p2 = new Person ("로이", 13);
		Person p3 = new Person ("강산", 5);
		
		System.out.println(p1.getName());
		System.out.println(p2.age);
		System.out.printf("%s" + " " + "%d" , p3.getName(), p3.age );
		System.out.println();
		
		System.out.println("no : " + Person.no); // 이걸 사용하세요..되도록이면
//		System.out.println("no : " + p1.no);
//		System.out.println("no : " + p2.no);
//		System.out.println("no : " + p3.no);
		
		p1.func(100);
		p2.func();
		
		Person.func2();
		
	}

}

class Person {
	private String name;   // 멤버변수, 인스턴스 변수
	int age;       // 멤버변수, 인스턴스 변수
	
	static double pi = 3.141592;  // 변하지 않는 고정값은 되도록이면 클래스 변수로...
	static int no = 0;  // 클래스 변수(정적변수) : 객체를 생성하기전 먼저 만들어져 있다.
	
	// 인수턴스 변수인 name 의 private 로 인해 get, set 메서드를 사용함.
	public String getName() { // 조회, 확인
		return name;
	}

	public void setName(String name) { // 수정 저장
		this.name = name;
	}

	void func() {
		
	}
	
	void func(int age) {   // 인스턴스 메서드, 멤버함수
		System.out.println("func 호출");
		age = age+1;
		no = no+1;
	}
	
	static void func2() {  // 클래스 메서드, 정적메서드
		System.out.println("func2 호출");
//		age = age+1;   "non-static field age"  <- 인스턴스 변수가 생성되기전이기 때문에 error
		no = no+1;
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
		
		no++;
	}
}
