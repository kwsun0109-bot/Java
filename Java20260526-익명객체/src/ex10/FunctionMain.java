package ex10;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		
//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t*t;
//			}
//		};
		Function<Integer, Integer> fun = (Integer t) -> t*t;
		System.out.println(fun.apply(10));
	}
}