package ex01;

/*
 * 학생 정보 관리 프로그램
 */

public class ClassEx01 {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		int age1 = 20;
		String phone1 = "010-1111-2222";
		
		String name2 = "이순신";
		int age2 = 30;
		String phone2 = "010-2222-3333";
		
		String name3 = "유관순";
		int age3 = 18;
		String phone3 = "010-4444-5555";
		
		studentInfo(name1, age1, phone1);
		studentInfo(name2, age2, phone2);
		studentInfo(name3, age3, phone3);

	}
	
	/*
	 * 함수이름 : StudentInfo
	 * 매개변수 : 문자열, 정수, 문자열 --> (String name, int age, String phone)
	 * 반환타입 : 없음
	 */
	
	static void studentInfo(String name, int age, String phone) {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
		System.out.println("-----------------------");
	
	}
	

}
