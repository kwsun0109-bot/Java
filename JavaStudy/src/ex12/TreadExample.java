package ex12;

public class TreadExample {

	public static void main(String[] args) {
		
		Runrun r = new Runrun();
		r.run();
	}
}

interface Runnable {
	void run();
}

class Runrun implements Runnable {
	@Override
	public void run() {
		System.out.println("말 달리자~~~~!");
	}
}