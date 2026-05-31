package ex07_다형성;

public class Car {
    public Tire tire;

    public void run() {
        tire.roll();
    }
}
