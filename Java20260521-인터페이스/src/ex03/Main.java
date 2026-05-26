package ex03;

public class Main {

	public static void main(String[] args) {

		Employee [] emp = new Employee[2];

		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);
		
		printEmployee(emp, false);
		printEmployee(emp, true);
	}		
	public static void printEmployee(Employee [] emp, boolean isTax) {

		if (isTax) {
			System.out.println("name\t" + "department\t" + "salay\t" + "tax\t" + "extra pay");
			System.out.println("-----------------------------------------------------------");
			for(int i=0; i<emp.length; i++) {
				System.out.print(emp[i].getName() + "\t" +  emp[i].getDepartment() + "\t  " + emp[i].getSalary() + "\t");
				// 다운 캐스팅
				if (emp[i] instanceof Sales) {
					Sales s = (Sales) emp[i];
					System.out.println(s.getExtraPay());
				} else {
					System.out.println("0");
				}
			}
		}else {
			System.out.println("name\t" + "department\t" + "salay\t" + "extra pay");
			System.out.println("-------------------------------------------------");
			for(int i=0; i<emp.length; i++) {				
				System.out.print(emp[i].getName() + "\t" +  emp[i].getDepartment() + "\t  " + emp[i].getSalary() + "\t");
				// 다운 캐스팅
				if (emp[1] instanceof Sales) {
					Sales s = (Sales) emp[1];
					System.out.println(s.getExtraPay());
				} else {
					System.out.println("Employee!!");
				}

			}
			System.out.println();
		}
	}
}
