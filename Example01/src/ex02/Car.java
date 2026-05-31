package ex02;

public class Car {
	
	int gas = 0;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("Gas가 없습니다.");
			return false;
		}
		System.out.println("Gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("진행 합니다." + "gas잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다." +  "gas잔량 : " + gas);
				return;
//				break;
			}
		}
	}

}
