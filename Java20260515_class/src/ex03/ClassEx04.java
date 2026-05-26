package ex03;

/*
 * 학생 성적처리 프로그램
 * 이름, 국어, 영어, 수학 입력
 * 총점, 평균을 구하는 클래스 설계
 */

public class ClassEx04 {

	public static void main(String[] args) {

		Student st1 = new Student("홍길동", 90, 91, 75);
		st1.studentInfo();
	
		System.out.println("총점: " + st1.total());
		System.out.println("평균: " + st1.avg());
		System.out.println("--------------------------");
		
		Student st2 = new Student("이순신", 85, 65, 73);
		st2.studentInfo();
	
		System.out.println("총점: " + st2.total());
		System.out.println("평균: " + st2.avg());
		System.out.println("--------------------------");
		
	}
	
}

class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	
	// 총점 함수
	int total() {
		
		int sum = kor + eng + math;
		return sum;
	}
	// 평균 함수
	double avg() {
		
		double average = total() / 3.0;
		return average;
	}
	
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

}

