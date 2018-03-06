package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList (
				new Person("Test1a", "Test1b",10),
				new Person("Test2a", "Test2b", 20),
				new Person("Test3a", "Test3b", 30),
				new Person("Test4a", "Test4b", 40),
				new Person("Test5a", "Test5b", 50)
				);
		
		printConditionaly(people, p -> true, System.out::println);

	}
	
	private static void printConditionaly(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}
}
