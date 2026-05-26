package ex04;

public class AccountMain {
	
	/*
	 * 생성자
	 * -> 자바는 객체를 생성아면 반드시 생성자가 호출된다
	 * -> 함수의 일종이다
	 * -> 생성자 오버로딩
	 * -> 생성자를 생성하지 않으면 디폴트 생성자를 자바에서 생성해줌
	 * -> 생성자 생성 방법
	 * 	  클래스명() : 클래스명 + 매개변수, 반환타입 없음
	 * 
	 * 생성자 용도
	 * - 멤버변수 초기화
	 * 
	 * 사용자가 생성자를 생성하지않으면
	 * 자바는 디폴트 생성자를 만들어 준다
	 * 단, 사용자가 생성자를 만들면, 디폴트 생성자는 만들어주지 않는다
	 * 항시 생성자는 디폴트로 만들어 놓는것이 좋다
	 */

	public static void main(String[] args) {
		
		System.out.println("이순신 잔고 통장 입출금 내역");
		Account lee = new Account(3000);
//		lee.setBalance(3000);
		lee.deposit(15000);
		lee.withdraw(8000);
		System.out.println("이순신 현재 잔고 : " + lee.getBalance());
		
		System.out.println("---------------------------------");
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong = new Account();
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println("홍길동 현재 잔고 : " + hong.getBalance());
	}

}

class Account{
	// 정보은익, 멤버변수는 외부공개 하지않는다.
	private int balance; // 잔고 -- 멤버 변수
	
	public Account() {
		System.out.println("디폴트 생성자");
	}
	
	public Account(int b) {
		balance = b;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
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
