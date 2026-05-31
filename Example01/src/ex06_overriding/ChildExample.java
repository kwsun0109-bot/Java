package ex06_overriding;

public class ChildExample {
    public static void main(String[] args) {

        Child child = new Child();

        child.method1();
        child.method2();
        child.method3();

        System.out.println("======================");

        Parent parent = new Child();   // 자동 타입 변환

        parent.method1();
        parent.method2();        // <-- 오버라이딩 됨..
        // parent.method3();     // 부모는 자식 메서드, 인스턴스 변수에 접근 불가, 단 오버라이딩되면 접근 가능

//        Child child = (Child) parent;  // 강제 타입 변환
//
//        child.method3(); // 부모타입을 자식타입으로 강제 형변환 하면 접근 가능하다.



    }
}
