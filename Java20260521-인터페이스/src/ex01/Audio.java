package ex01;

public class Audio implements RemoteControl {

	@Override
	public void powerOn() {

		System.out.println("Audio 전원 ON");
	}

	@Override
	public void powerOff() {
	
		System.out.println("Audio 전원 OFF");
	}

}
