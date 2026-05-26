package ex01;

import java.io.FileReader;
import java.io.IOException;

public class TestEx05 {

	public static void main(String[] args) throws IOException {
		
		try {
			method1();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("1");
	}

	static void method1() throws ClassNotFoundException {

		method2();
		System.out.println("2");
	}
	
	static void method2() throws ClassNotFoundException {	

		Class.forName("Java.lang.String2");
		System.out.println("3");
		
	}
}
