package Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.*;

public class Streams {
	
		public static void main(String[] args)
		{
			IntStream
			.range(1, 10)
			.skip(7)
			.forEach(i -> System.out.println(i));
			
			System.out.println(
					IntStream
					.range(1, 6) // [1,6)
					.sum()
					);
			
			Stream.of("Toyota", "Tata", "BMW", "Opel")
			       .sorted()
			       .findFirst()
			       .ifPresent(System.out::println);
			
			String[] names = {"Marry", "John", "George", "Jane"};
			Arrays.stream(names)
				.filter(x -> x.startsWith("J"))
				.sorted()
				.forEach(System.out::println);
			
			Arrays.stream(new int[] {1,2,3,5})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);
			
			IntSummaryStatistics statistics = IntStream.of(7,4,6,3,2,9,12,3)
												.summaryStatistics();
			
			System.out.println(statistics);
			
			
		}
}
