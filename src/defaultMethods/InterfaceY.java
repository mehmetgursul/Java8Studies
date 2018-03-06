package defaultMethods;

public interface InterfaceY {
	default void hi() {
		System.out.println("Hi from Y");
	}
}
