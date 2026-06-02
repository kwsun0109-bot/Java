package ex14_제네릭;

public class GenericEx02 {

	public static void main(String[] args) {
		 
		Box<String> box = new Box<>();
		
		box.set("안녕, 제네릭!!");
		System.out.println(box.get());
	}

}