package lambdaExpressions;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		//Thread th = new Thread (() -> printMessage());
		Thread th = new Thread (MethodReferenceExample1::printMessage); // Same as above call
		th.start();

	}
	
	
	public static void printMessage() {
		System.out.println("Hi!");
	}

}
