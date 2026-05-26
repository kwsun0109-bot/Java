package ex02;

//결제
public interface Payment {
	void pay(int money);
	
	
	
	// 할인기능 추가(프로그램 차후에 추가로 작성)
	// 구현을 해도되고 않해도됨
	default void coupon() {
		System.out.println("할인기능은 각 구현클래스에서 개별적으로 하세요.");
	};
}
