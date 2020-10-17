package functionalInterface;

import java.util.function.BiConsumer;

public class WrapperLambdaExceptionHandling {
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4};
		int key =0;
		process(numbers,key,wrapperLambda((k,v) -> System.out.println(v/k)));
	}

	private static void process(int[] numbers, int key,BiConsumer<Integer, Integer> consumer) {
		for(int v:numbers) {
			consumer.accept(key,v);
		}
		
	}
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (k,v)->{
		try {
			consumer.accept(k,v);
		}
		catch(ArithmeticException e) {
			System.out.println("Arthimetic Exception caught in Wrapper Lambda");
		}
	};
}
}
