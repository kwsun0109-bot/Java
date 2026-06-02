package ex14_제네릭;

public class GenericEx01 {

	public static void main(String[] args) {
		 
		Box<Integer> box = new Box<>();
		
		box.set(1000);
		System.out.println(box.get());
	}
}