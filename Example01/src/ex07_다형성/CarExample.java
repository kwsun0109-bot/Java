package ex07_다형성;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.tire = new Tire();
        car.run();

        car.tire = new HankookTire();
        car.run();
        car.tire = new KumhoTire();
        car.run();

        // 다형성은 부모의 메서드를 오버라이딩한 자식메서드들의 내용이 다르므로 출력또한 다르게 나온다. 이것이 다형성이다
    }
}
