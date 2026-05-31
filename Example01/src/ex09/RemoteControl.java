package ex09;

public interface RemoteControl {

    public void turnOn();
    default public void turnOff(){};
}
