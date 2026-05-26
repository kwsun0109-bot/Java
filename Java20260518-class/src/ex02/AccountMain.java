package ex02;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("이순신 잔고 통장 입출금 내역");
		Account lee = new Account();
		lee.deposit(15000);
		lee.withdraw(8000);
		System.out.println("이순신 현재 잔고1 : " + lee.getBalance());
		
		lee.deposit(10000);
		lee.withdraw(3000);
		System.out.println("이순신 현재 잔고2 : " + lee.getBalance());
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong = new Account();
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println("홍길동 현재 잔고 : " + hong.getBalance());
	}

}

class Account{
	private int balance = 0;           // 잔고 -- 멤버 변수
	
	int getBalance(){
		return balance;
	}
	
	void deposit(int amount) { // 입금
		balance += amount;
	}
	void withdraw(int amount) { // 출금
		balance -= amount;
	}
}
