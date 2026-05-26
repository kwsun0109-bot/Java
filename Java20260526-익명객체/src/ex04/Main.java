package ex04;

interface ButtonClick {
	void click();  //버튼이 클릭이 되었어요!
	void doubleClick(); // 버튼을 떠블클릭 했어요
}

public class Main {

	public static void main(String[] args) {
	
		ButtonClick bc = new ButtonClick() { // <--익명 객체
			@Override
			public void click() {
				System.out.println("버튼이 클릭 되었어요.");
			}
		
			@Override
			public void doubleClick() {
				System.out.println("버튼을 떠블클릭 했어요.");
			}
		};
		bc.click();
		bc.doubleClick();

	}

}
