package ex10_sql;

public class Student {

    private String name;
    private String studentId;
    private double score;

    public Student() {}
    public Student(String name, String studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return String.format("이름 : %s, 학번 : %s, 점수 : %.2f", name, studentId, score);
    }

}
