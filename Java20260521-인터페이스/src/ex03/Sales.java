package ex03;

public class Sales extends Employee implements Bonus {
	
	public Sales() {
	
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public double tax() {
		return getSalary() * 0.13;
	}
	@Override
	public void incentive (int pay) {
		int total = (int)(getSalary() + (pay * 1.2));
		setSalary(total);		
	}

	public double getExtraPay() {
		if (getDepartment() == "2") {
			return getSalary() * 0.03;
		}
		return 0;
	}
}		

