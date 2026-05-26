package ex01;
import java.math.BigDecimal;

public class SampleEx {

	public static void main(String[] args) {
	
		System.out.println("Hello, Java21!!");
		
		/*
		 * 실수형 float, double가 있음. float에는 반드시 숫자뒤에 'f'를 붙인다
		 */
		
		int age = 0;  // --> 일반 변수(변경 가능한 변수)
		final double PI = 3.14159; // --> 원주율은 변경 되면 안되기 때문에 상수화
		
		
		age = age + 1;
		/*
		 * 형변환
		 * 자동형변환, 강제형변환
		 * 자동형변환 : 작은자료형을 큰 자료형 대입(값 손실 없음)
		 * 강제형변환 : 큰 자료형을 작은 자료형 대입 (값 손실 가능성 존재)
		 */

		double d1 = 10.1;  // 실수형 변수는 기본값으로 8byte를 잡고 있음.
		float f1 = 10.1f;  // 형변환 - (4byte)실수형에 값을 저장.
		
		// 실수형은 대소비교를 하지 말것.
		BigDecimal db1 = new BigDecimal("0.1");
		BigDecimal db2 = new BigDecimal("0.2");
		System.out.println("0.1 + 0.2 = " + db1.add(db2));
		
		int a = 10;
		int b = 3;
		
		double ex = 1.2 + 10;  // 정수를 실수로 자동 형변환하여 계산함.
		System.out.println(ex);
		
	
		d1 = a;
		d1 = f1;
	
		f1 = (float)d1; // <-- 데이터 손실 가능성존재....가급적이면 사용하지 말것  
		
		System.out.println(a/b);
		System.out.println(a/(double)b);
		
		int intB;
		long longA = 2500000000L;
		intB = (int)longA;
		System.out.println("이상한 " + intB);
		System.out.println(longA);
	}

}
