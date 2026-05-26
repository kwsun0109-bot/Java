package ex03;

public class AccountMain {
	
	/*
	 * Setter, Getter
	 * 멤버변수는 반드시 private 외부 노출 금지로 인해
	 */

	public static void main(String[] args) {
		
		System.out.println("이순신 잔고 통장 입출금 내역");
		Account lee = new Account();
//		lee.balance = -1000000;     "The field Account.balance is not visible"
		lee.deposit(-15000);
		lee.withdraw(8000);
		System.out.println("이순신 현재 잔고 : " + lee.getBalance());
		
//		lee.deposit(10000);
//		lee.withdraw(30000);
//		System.out.println("이순신 현재 잔고2 : " + lee.balance);
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong = new Account();
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println("홍길동 현재 잔고 : " + hong.getBalance());
	}

}

class Account{
	// 정보은익, 멤버변수는 외부공개 하지않는다.
	private int balance;            // 잔고 -- 멤버 변수
	
	/*
	 * Getter : 멤버변수값을 확인하는 용도
	 * Setter : 몀버변수값을 저장하는 용도
	 */
	
	/*
	 * Getter 생성방법
	 * getter는 함수로 생성
	 * 변환타입 -> 멤버변수 자료형 이용
	 * 함수이름 -> get + 멤버변수, 단 멤버변수 첫글자는 대문자, 카멜표기법
	 */
	
	public int getBalance() { // 멤버변수의 값을 조회(확인)
		return balance;
	}
	
	/*
	 * Setter 생성방법
	 * 반환타입 -> 없음
	 * 함수명 : set + 멤버변수명 -> 카멜표기법
	 * 매개변수 : (멤버변수 자료형)
	 */
	public void setBalance(int balance) { // 멤버변수의 값을 저장
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
//			System.out.println("잔고 " + balance + " 출금금액 " + amount + " 인출불가");
			System.out.println("잔고부족 인출불가");
		}
		else {
			balance -= amount;
		}
		
	}

}
