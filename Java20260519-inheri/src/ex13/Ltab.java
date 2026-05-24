package ex13;

public class Ltab extends Mobile{
	
	public Ltab() {

	}
	 
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public void operate(int time) {
		// 1분 사용시 배터리 10감소
		int battery = getBatterySize();
		battery -= time*10;
		setBatterySize(battery);
	}

	@Override
	public void charge(int time) {
		// 1분 충전시 배터리 10증가
		int battery = getBatterySize();
		battery += time*10;
		setBatterySize(battery);
	}

}
