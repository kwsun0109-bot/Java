package ex03;

public class SingletonExam {

	public static void main(String[] args) {

		// 싱글톤으로 객체 주소획득
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		s1.setName("mmmmmmm");
		System.out.println(s1.getName());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s2.getName());
	}

}
