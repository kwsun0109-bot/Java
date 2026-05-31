package ex06_overriding;

public class ComputerExample {
    public static void main(String[] args) {

        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));

        Calculator ca = new Computer();
        System.out.println("면적은 어디? " + ca.areaCircle(r));  //다형성(polymorphism)

        // 부모 타입으로 자동 타입 변환된 이후에는 부모클래스에 선언된 필드(인스턴스 변수),메소드만 접근이 가능함
        // 다만, 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다.
    // 311 페이지 ~~
    }

}
