package ex13;

public class Otab extends Mobile{

		public Otab() {

	}
	 
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		// 1분 사용시 배터리 12감소		//
		int battery = getBatterySize();
		battery -= time*12;
		setBatterySize(battery);		
	}

	@Override
	public void charge(int time) {
		// 1분 충전시 배터리 8증가
		int battery = getBatterySize();
		battery += time*8;
		setBatterySize(battery);
	}

}
