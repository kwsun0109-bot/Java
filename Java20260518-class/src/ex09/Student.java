package ex09;

public class Student {
	
	/*
	 * 인스턴스 변수, 멤버변수
	 * 객체마다 개별적으로 생성
	 */
	private String name;  // 인스턴스 변수
	private int score;
	
	/*
	 * 클래스 변수, 정적변수, static변수
	 * 객체들이 공통적으로 사용
	 */
	static int studentCount = 0;
	
	// 생성자
	/*
	 * 생성자 생성
	 */
	public Student() {
		// studentCount++;
	}
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		
		// 학생 객체가 생성될때 마다 증가
		studentCount++;
	}
	
	/*
	 * 인스턴스 메서드
	 * 객체마다 개별적으로 동작
	 */
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
		System.out.println("---------------------");
	}
	
	/*
	 * 클래스 메서드(정적메서드)
	 * 객체 생성 없이 사용가능
	 * 
	 */
	static void showStudentCount() {
		System.out.println("전체 학생수 : " + studentCount);
	}

	/*
	 * 인스턴스 변수의 private로 인해......
	 */
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
