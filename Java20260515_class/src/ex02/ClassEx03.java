package ex02;

/*
 * 학생 정보 관리 프로그램
 */

public class ClassEx03 {

	public static void main(String[] args) {
		
		//객체 생성, 인스턴스 생성
		Member hong = new Member("홍길동", 20, "010-1111-2222"); 
		hong.memberInfo();
		
		Member lee = new Member("이순신", 30, "010-2222-3333");		
		lee.memberInfo();

		Member lue = new Member("유관순", 18, "010-4444-5555");
		lue.memberInfo();
			
	}	
}

/*
 * 클래스 
 * 	변수(멤버변수)
 * 	메소드(함수)
 *  멤버변수 앞에 private를 붙이면 그 멤버변수는 외부 공개안함
 *  내부 클래스에서만 사용가능
 *  멤버변수는 외부 공개 안하는 것이 원칙 	
 */
class Member {
	
	private String name;
	private int age;
	private String phone;
	
	// 생성자 -> 멤버변수 초기화 용도, 반환값이 없음
	public Member(String name, int age, String phone) {
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		
	}
	
	void memberInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
		System.out.println("-----------------------");
		
	}
}

