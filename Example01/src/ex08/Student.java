package ex08;

public class Student extends Person {

    @Override
    public void personEx() {
        System.out.println("부모 Person 객체의 Override 입니다");
    }

    public void StudentEx() {
        System.out.println("Student");
    }
}
