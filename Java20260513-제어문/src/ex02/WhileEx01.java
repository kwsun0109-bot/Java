package ex02;

public class WhileEx01 {

	public static void main(String[] args) {
	
		int i = 1;   //초기값
		int sum = 0;  
		
		while(i<=5) {  //조건
			sum += i;
			System.out.println("현재 i : " + i + " 합은 : " + sum);
			i++; //증가값
		}
		System.out.println("총합 : " + sum);
	}

}
