package ex10_1;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		
		Function<Integer, Integer> fun = t -> t*t;

		System.out.println(fun.apply(10));
	}
}
