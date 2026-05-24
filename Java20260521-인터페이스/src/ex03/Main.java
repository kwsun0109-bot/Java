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
			for(int i=0; i<emp.length; i++)
				System.out.println(emp[i].getName() + "\t" +  emp[i].getDepartment() + "      " + 
			                       emp[i].getSalary() + "\t" + ((Sales)emp[i]).getExtraPay()); //  세금, 수당);
		}else {
			System.out.println("name\t" + "department\t" + "salay\t" + "extra pay");
			System.out.println("-------------------------------------------------");
			for(int i=0; i<emp.length; i++) {				
				System.out.println(emp[i].getName() + "\t" +  emp[i].getDepartment() + "      " +
			                       emp[i].getSalary());			
			}
		}
	}
}
