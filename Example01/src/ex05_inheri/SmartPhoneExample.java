package ex05_inheri;

public class SmartPhoneExample {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("캘럭시", "은색");

        System.out.println("모델 :  " + myPhone.model);
        System.out.println("색상 :  " + myPhone.color);

        System.out.println("와이파이 상태 : " + myPhone.getWifi());

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동입니다. 이순신 있어요?");
        myPhone.sendVoice("네 안녕하세요. 전화를 잘못거신거 같아요. 그런분은 안계세요.");
        myPhone.receiveVoice("음. 죄송합니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        System.out.println("와이파이 상태를 변경했습니다." + myPhone.getWifi());
        myPhone.internet();
    }
}
