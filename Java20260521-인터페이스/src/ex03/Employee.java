package ex03;

public abstract class Employee {
	
	private String name;  //사원이름
	private int number;   // 사원번호
	private String department;  // 부서명
	private int salary;      // 급여
	
	public Employee () {
		
	}
	
	public Employee (String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	// 세금
	public abstract double tax();

	int getSalary() {
		return salary;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

	
}
