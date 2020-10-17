package functionalInterface;

import java.util.function.BiConsumer;

public class LambdaExceptionHandlingExample {
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4};
		int key =0;
		process(numbers,key,(k,v) ->{
			try {
				System.out.println(v/k);
			}
			catch(ArithmeticException e) {
				System.out.println("Arthimetic Exception");
			}
		});
	}

	private static void process(int[] numbers, int key,BiConsumer<Integer, Integer> consumer) {
		for(int v:numbers) {
			consumer.accept(key,v);
		}
		
	}

}
