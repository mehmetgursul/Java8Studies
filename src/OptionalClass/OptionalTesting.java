package OptionalClass;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class OptionalTesting {
	
	@Test
	public void shouldReturnLastValue() {
		List<Integer> actual = asList(1, 5, 15, 25, 35, 45, 65);
		Optional<Integer> result = actual.stream().filter(p -> p > 50).findFirst();
		assertEquals(result, Optional.of(65));
	}
	
	@Test
	public void shouldReturnEmptyOptional() {
		List<Integer> actual = asList(1, 5, 15, 25, 35, 45, 65);
		Optional<Integer> result = actual.stream().filter(p -> p > 80).findFirst();
		assertEquals(result, Optional.empty());
	}
	
	@Test
	public void shouldReturnPresent() {
		List<Integer> actual = asList(1, 5, 15, 25, 35, 45, 65);
		Optional<Integer> result = actual.stream().filter(p -> p > 50).findFirst();
		assertEquals(result.isPresent(), true);
	}
}
