package ex03;

interface ButtonClick {
	void click();  //버튼이 클릭이 되었어요!
}

class ButtonClass implements ButtonClick { // 구현클래스
	@Override
	public void click() {
		System.out.println("버튼이 클릭이 되었어요!");
	}
}

public class Main {

	public static void main(String[] args) {

		ButtonClick bc = new ButtonClass();  // <-- 구현체만 올수 있다
		bc.click();

	}

}
