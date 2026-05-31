package ex05_inheri;

public class SmartPhone extends Phone {

    private boolean wifi;
    public SmartPhone() {}
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public boolean getWifi() {
        return wifi;
    }
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
