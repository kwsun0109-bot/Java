package ex12;

public class StaticNested {

	public static void main(String[] args) {
		
		Outer.StaticInner si = new Outer.StaticInner();
		si.print();
	}
}
// 중첩 클래스 (정적 중첩 클래스 - Static Nested Class)
class Outer {
	
	private static String staticMsg = "Static Message";
	
	static class StaticInner {
		void print() {
			System.out.println("Accessing: " + staticMsg);
		}
	}
}
