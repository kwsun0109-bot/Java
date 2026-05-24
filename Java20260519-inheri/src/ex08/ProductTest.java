package ex08;

public class ProductTest {

	public static void main(String[] args) {
		
		Product [] p1 = new Product[5];
		p1[0] = new Product("짱구", 10, 1500);
		p1[1] = new Product("과자", 8, 1300);
		p1[2] = new Product("카스", 15, 4500);
		p1[3] = new Product("오징어", 5, 1000);
		p1[4] = new Product();

		for (int i=0; i<5; i++) {
			System.out.print(p1[i].getName() + " ");
			System.out.print(p1[i].getBalance() + " ");
			System.out.print(p1[i].getPrice() + "원");
			System.out.println();
		}
	}

}
