package ex02;

//클랙스 명은 카멜표기법으로 기입

/*
  여러줄 주석(코멘트 or 설명문)
  클래스 명은 카멜 표기법 => 자바는 기본이 카멜표기법임.
  카멜표기법 : 
  - 영문자 첫글자는 대문자
  - 영문자 두 단어가 조합되있으면 첫글자, 두번째 단어 대문자
  예) saleorder --> Saleorder
  스네이크 표기법 : 데이터베이스(오라클, mysql, maridb)
  예) Sale_order
 */
public class VariableEx01 {

	public static void main(String[] args) {
		
		// 산술연산자 : +, -, *, /, %
		// 관계연산자 : >, <, >=, <=
		// ==, !=
		
		System.out.println(5 / 2.0); // 2.5
		System.out.println("나머지 : " + 5 % 2); // 나머지 연산자, 1
		
		System.out.println(5 > 2);
		System.out.println(5 < 2);
		
		// a = b --> b(우항)이 가지고있는 값을 a(좌항) 대입
		System.out.println(5 == 5); // == 같다
		
		// 줄복사 : ctrl + alt + 방향키 아래
		System.out.println(5 != 5); // != 같지않다
		
		// 정수형변수 a를 생성했고, 이공간에는 +- 21억값을 입력 하겠다
		int a = 5;
		
		a = a + 1; // 6
		a += 1;    // 7
		a++;       // 8	   a = a + 1, 후위연산자
		++a;       // 9    a = a + 1, 선위연산자
		System.out.println(a);
		
		int b = 10;
		int c;
		int d;
		
		c = b++;   // 1. c = b; 2. b = b + 1;
		d = ++b;   // 1. b = b + 1, 2. d = b;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int ss = 4000/3600;
		int dd = 400/60;
		int mm = dd/60;
		System.out.println(mm + "시간" +  dd + "분" + ss + "초");
		
		
		
	}

}
