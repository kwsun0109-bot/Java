package ex02;

public class WhileEx02 {

	public static void main(String[] args) {
	
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			if (i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println("총합 : " + sum);
	}

}
