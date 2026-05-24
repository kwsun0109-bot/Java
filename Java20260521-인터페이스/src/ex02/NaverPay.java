package ex02;

// 네이버
public class NaverPay implements Payment  {
	@Override
	public void pay (int money) {
		
		System.out.println("네이버로 " + money + "원 결제");
	}
	
	@Override
	public void coupon() {
		System.out.println("15% 할인 적용");
	}

}
