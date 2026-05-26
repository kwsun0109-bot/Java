package ex09;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("싸이", 95);
		Student s2 = new Student("로이", 85);
		Student s3 = new Student("쁘양", 78);
		Student s4 = new Student();
		
		s1.showInfo();
		s2.showInfo();
		
		s3.showInfo();
//		System.out.println("s3 이름은 : " + s3.getName());	
//		s3.setName("제시");
		s4.showInfo();
		
		// 클래스 메서드 호출(전체 학생수)
		Student.showStudentCount();

	}

}
