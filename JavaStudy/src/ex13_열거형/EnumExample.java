package ex13_열거형;

public class EnumExample {

	public static void main(String[] args) {
		
		Day today = Day.Friday;
		System.out.println("today " + today);
		
		for (Day d : Day.values()) {
			System.out.printf("%s ", d);
		}
		Day day = Day.valueOf("Monday");
		System.out.println("\n선택된 요일은 " + day);

	}

}
// 열거형
enum Day {   //public static final 상수로 컴파일 됨 
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}