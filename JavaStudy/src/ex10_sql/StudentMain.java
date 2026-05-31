package ex10_sql;

public class StudentMain {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("홍길동", "S001", 87.5));
        manager.addStudent(new Student("이순신", "S010", 97.2));
        manager.addStudent(new Student("김유신", "S021", 77.3));
        manager.addStudent(new Student("장보고", "S103", 57.9));
        manager.addStudent(new Student("유관순", "S075", 65.6));

        System.out.println("========== 학생 목록 ==========");
        manager.showAllStudent();

        System.out.printf("평균 점수 : %.2f%n", manager.getAvgScore());
        System.out.println("최고 학생 점수 : " + manager.getTopStudent());
    }
}
