package ex03;

public class Secretary extends Employee implements Bonus {
	
	public Secretary() {
		
	} 
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary() * 1.0;
	}
	
	@Override
	public void incentive(int pay) {
		int total = (int)(getSalary() + (pay * 0.8));
		setSalary(total);
	}
	
}
