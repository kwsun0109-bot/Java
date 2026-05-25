package ex04;

/*
 * 생성자(constructor)
 *  - 자바는 객체를 생성하면 반드시 생성자가 호출된다!!
 *  - 생성자는 함수 일종..
 *  - 생성자 오버로딩이 됨(매기변수는 달라야한다)
 *  - 생성자를 생성하지않으면 디폴드 생성자를 자바에서 생성해줌
 *  - 생성자가 다른 생성자를 호출할때는 반드시 첫줄에 코드 작성.
 *  - 생성자의 이름으로 클래스이름 대신 this를 사용한다
 *
 *  * 생성자 생성 방법
 *  클래스명() : 클래스명과 같아야한다 + 매개변수, 반환타입 없음.
 *  
 *  생성자 용도:
 *   - 멤버변수 초기화, 객체를 생성하는것이 아님(객체를 생성하는 것은 new연산자임.)
 *   
 *   사용자가 생성자를 생성하지않으면
 *   자바는 디폴트 생성자를 만들어준다.
 *   단. 사용자가 생성자를 만들면, 디폴드 생성자는 만들어주지않는다.
 *    
 */
public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("이순신 거래 내역");
		Account lee = new Account(3000);
		
		//lee.setBalance(3000);
		//lee.balance = -100000;
		
		lee.deposit(-15000);
		lee.withdraw(8000);		
		System.out.println("이순신 현재 잔고: " + lee.getBalance());
		
		System.out.println("------------------------------");
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong  = new Account();
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println("홍길동 현재 잔고: " + hong.getBalance());
	}

}

class Account{
	//정보은닉, 멤버변수는 외부 공개하지 않는다!!!
	private int balance;
	
	public Account() {	
	}
	
	public Account(int balance) {

		this.balance = balance;  // 여기서 this는 참조변수, this()는 생성자
	}

	public int getBalance() {

		return balance;
	}

	public void setBalance(int b) {
		balance = b;
	}
	
	void deposit(int amount) { //입금		
		if(amount>0)
			balance += amount;
		else
			System.out.println("마이너스는 입금 불가");
	}
	

	void withdraw(int amount) { //출금
		if(amount >balance) {
			System.out.println("잔고부족 인출불가");
		}else {		
			balance -=amount;
		}
	}	
	
}