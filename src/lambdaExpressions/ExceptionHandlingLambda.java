package lambdaExpressions;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 0, 5 };
		int key = 20;

		add(numbers, key, wrapperLambda((v, k) -> System.out.println(k / v)));
	}

	private static void add(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer)
	{
		return (v,k) -> {
			try {
			consumer.accept(v, k);
			} catch (ArithmeticException ex) {
				System.out.println("Exception caught in wrapper lambda!");
			}
		};
	}

}
