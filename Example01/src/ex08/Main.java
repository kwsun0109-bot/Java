package ex08;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        Person p2 = new Student();

        p1.personEx();
        p2.personEx();

        if (p1 instanceof Student) {  // p1 객체가 Student 클래스의 인스턴스(객체)인지 확인하는 올하른 방법
            System.out.println("ture");
        } else System.out.println("false");


    }
}
