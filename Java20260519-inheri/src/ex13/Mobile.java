package ex13;

// 추상클래스
public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {

	}

	// 추상 메서드
	public abstract void operate(int time);{

	}

	public abstract void charge(int time);{

	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	@Override
	public String toString() {
		return mobileName + "\t" + batterySize + "\t" + osType;
	}

}
