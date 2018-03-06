package defaultMethods;

public interface InterfaceX {
	default void hi() {
		System.out.println("Hi from X");
	}
}
