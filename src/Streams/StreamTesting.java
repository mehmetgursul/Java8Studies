package Streams;

import static java.util.Arrays.asList;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamTesting {

	@Test
	public void shouldMapStringsToUpperCase() {
		List<String> actual = asList("this", "is", "java", "test");
		List<String> result = actual.stream().map(String::toUpperCase).collect(Collectors.toList());
		assertThat(result, contains("THIS", "IS", "JAVA", "TEST"));
	}
	
	@Test
	public void shouldReturnSquare() {
		List<Integer> actual = asList(1, 5, 13, 25);
		List<Integer> result = actual.stream().map(p -> p * p).collect(Collectors.toList());
		assertThat(result, contains(1, 25, 169, 625));
	}
	
	@Test
	public void shouldLimit4Elements() {
		List<Integer> actual = asList(1, 5, 15, 25, 35, 45, 65);
		List<Integer> result = actual.stream().limit(4).collect(Collectors.toList());
		assertThat(result, contains(1, 5, 15, 25));
	}
	
	@Test
	public void shouldSkip4Elements() {
		List<Integer> actual = asList(1, 5, 15, 25, 35, 45, 65);
		List<Integer> result = actual.stream().skip(4).collect(Collectors.toList());
		assertThat(result, contains(35, 45, 65));
	}

}
