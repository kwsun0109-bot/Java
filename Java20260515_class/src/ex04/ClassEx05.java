package ex04;

/*
 * 학생 성적처리 프로그램
 * 이름, 국어, 영어, 수학 입력
 * 총점, 평균을 구하는 클래스 설계
 */

public class ClassEx05 {

	public static void main(String[] args) {

		Student st1 = new Student("홍길동", 90, 91, 75);  // <-- 생성자를 호출한다
		st1.studentInfo();
		System.out.println("총점: " + st1.total());
		System.out.printf("평균: %.2f\n", st1.avg());
		System.out.println("--------------------------");
		
		Student st2 = new Student("이순신", 85, 65, 73);
		st2.studentInfo();
		System.out.println("총점: " + st2.total());
		System.out.printf("평균: %.2f\n", st2.avg());
		System.out.println("--------------------------");
		
	}
	
}

class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 총점집계 함수정의
	int total() {
		
		int sum = kor + eng + math;
		return sum;
	}
	// 평균계산 함수정의
	double avg() {
		
		double average = total() / 3.0;
		return average;
	}
//	String getName() {
//		return name;
//	}
	public Student() {

	}
	//생성자 생성 - 클래스의 속성 선언시 각 변수가 private이면 생성한다.
	public Student(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	void studentInfo() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("산수: " + math);
	}
//	속성이 private이면 외부에서 값을 넣기 위해
//	매개변수를 가진 생성자를 정의하는 것이 일반적이다.
//	하지만 생성자는 private 변수가 없어도 객체의 초기화나
//	필수 데이터 세팅을 위해 언제든 생성할 수 있다.

}


