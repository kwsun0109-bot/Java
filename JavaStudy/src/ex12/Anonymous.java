package ex12;

public class Anonymous {

	public static void main(String[] args) {

		// 익명 클래스는 보통 인터페이스를 즉석에서 구현하는 데 사용되며, 람다식 이전의 이벤트 처리 방식으로 자수 등장함
		// 일회성 클래스로 추상 클래스나 인터페이스를 즉시 구현할 때 사용됩니다.
		
		ClickListener button = new ClickListener() {
		
			public void onClick() {
				System.out.println("버튼 클릭!");	
			}
		};
		button.onClick();
	}
}

interface ClickListener {
	void onClick();
}