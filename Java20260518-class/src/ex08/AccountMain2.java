package ex08;

public class AccountMain2 {
	
	/*
	 * this 2가지 용도
	 *  - this는 객체 자신을 가르킨다
	 *  - 다른 생성자 호출
	 */

	public static void main(String[] args) {
		
		System.out.println("잔고 통장 입출금 내역");
		System.out.println("---------------------------------");
		Account lee = new Account("이순신", 3000);
		lee.deposit(-15000);
		lee.withdraw(8000);
		System.out.println(lee.getName() + " 현재 잔고 : " + lee.getBalance());		
		System.out.println("---------------------------------");
		
		Account hong = new Account("홍길동", 3000);
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println(hong.getName() + " 현재 잔고 : " + hong.getBalance());
		System.out.println("---------------------------------");
		
		Account kim = new Account(); // 익명, 잔고 0
		System.out.println(kim.getName() + " 현재 잔고 : " + kim.getBalance());
		System.out.println("---------------------------------");
		
		Account park = new Account(1000); // 익명, 잔고 1000
		System.out.println(park.getName() + " 현재 잔고 : " + park.getBalance());
		System.out.println("---------------------------------");
		
		Account lue = new Account("유관순", 3000); // 유관순, 잔고 3000
		System.out.println(lue.getName() + " 현재 잔고 : " + lue.getBalance());
		System.out.println("---------------------------------");
		
		/*
		 * 클래스 변수, 인스턴스(멤버)변수, 지역변수
		 */
		
		// instance변수
		Car c1 = new Car(2000);
		c1.func();
		System.out.println("c1 " + c1.car1);
		Car c2 = new Car(100L);
		c2.func();
		System.out.println("c2 " + c2.car2);
		
		Bus.func2();  // 클래스 변수(static사용)
		
	}

}

class Account {
	
	// 정보은익, 멤버변수는 외부공개 하지않는다.
	private int balance; // 잔고 -- 멤버 변수 or 인스턴스 변수
	private String name;

	static int max = 100; // 클래스 변수
	
	//------생성자 생성 --------------------------------------------
	public Account() {
		this("익명", 0);   // 생성자 체이닝
	}
	
	public Account(int balance) {
		this("익명", balance);
	}
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//------get, set 생성 --------------------------------------------	
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// -- 함수 생성
	void deposit(int amount) {  // 입금
		if (amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("마이너스는 입금 불가");
		}
	}
	void withdraw(int amount) { // 출금
		if (amount > balance) {
			System.out.println("잔고부족 인출불가");
		}
		else {
			balance -= amount;
		}		
	}
}

class Car {
	int car1;
	long car2;
	
	void func() {
		System.out.println("func() 호출");
	}
	
	// 생성자오버로딩 시 타입, 인자의개수가 서로 상이해야하며 반환값은 상관없다
	public Car() {
		
	}
	public Car(int car1) {
		this.car1 = car1;
	}
	public Car(long car2) {
		this.car2 = car2;
	}
}

class Bus {
	static int bus1=10000;
	
	static void func2() {
		System.out.println("func2 호출");
	}
}
