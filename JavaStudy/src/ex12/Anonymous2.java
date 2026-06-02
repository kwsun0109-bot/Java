package ex12;

public class Anonymous2 {

	public static void main(String[] args) {
		
		ClickClick button = new ClickClick();
		button.onClick();
	}
}

interface ClickListener1 {
	void onClick();
	
}

class ClickClick implements ClickListener1 {
	@ Override
	public void onClick() {
		System.out.println("버튼 클릭!");	
	}
	
	public ClickClick() {
		// TODO Auto-generated constructor stub
	}
}