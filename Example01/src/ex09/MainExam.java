package ex09;

public class MainExam {
    public static void main(String[] args) {
        /*
        추상은 실체 간에 공통되는 특성을 추출한 것을 말함. (abstract)
        객체를 생성할 수 있는 클래스를 실체 클래스라고 한다면, 이 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를
        추상 클래스라고 한다. 추상 클래스는 실체 클래스의 부모역활을 한다.
        추상 클래스는 실체 클래스의 공통되는 인스턴스 변수와 메서드를 추출해서 만들었지 때문에 new 연산자를 사용하여 객체를 생성
        할 수 없다
         */
        // 인터페이스 :

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();

    }
}
