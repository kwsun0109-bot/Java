package ex10_2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		
//		BiFunction<Integer, Integer, Double> f1 = new BiFunction<Integer, Integer, Double>() {
//			
//			@Override
//			public Double apply(Integer t, Integer u) {
//				return (double)t/u;
//			}
//		};
		BiFunction<Integer, Integer, Double> f1 = (t, u) -> (double)t/u;

		System.out.println(f1.apply(5, 2));  // --> apply : Method Details
	}
}