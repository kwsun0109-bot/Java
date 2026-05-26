package ex05;

@FunctionalInterface // 추상메서드가 1개만 존개
interface ButtonClick {
	void click();  //버튼이 클릭이 되었어요!
}

public class Main {

	public static void main(String[] args) {
	
		/*
		 * ex04를 람다식으로 변경
		 */
//		ButtonClick bc = 
//			    // 람다식...  추상메서드가 한개만 존재해야 한다.
//				() -> { // <-- "()"은 인터페이스 메서드임.
//					System.out.println("버튼이 클릭이 되었어요!");
//				};
		ButtonClick bc = () -> System.out.println("버튼이 클릭이 되었어요!");
		
		bc.click();

	}

}
