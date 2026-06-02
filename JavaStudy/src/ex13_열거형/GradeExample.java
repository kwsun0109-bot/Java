package ex13_열거형;

public class GradeExample {

	public static void main(String[] args) {
		
		for (Grade grade : Grade.values()) {
			System.out.println(grade + " 등급 " + grade.getLabel());
		}

	}

}

enum Grade {
	Basic("일반"), Sliver("은"), Gold("금"), Platinum("백금");
	
	private final String label;
	
	Grade(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
}