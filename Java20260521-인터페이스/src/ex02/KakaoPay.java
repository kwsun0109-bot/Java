package ex02;

// 카카오
public class KakaoPay implements Payment  {
	@Override
	public void pay (int money) {
		System.out.println("카카오로 " + money + "원 결제");
	}
	
	@Override
	public void coupon() {
		System.out.println("10% 할인 적용");
	}

}
