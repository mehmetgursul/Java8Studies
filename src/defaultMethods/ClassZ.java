package defaultMethods;

public class ClassZ implements InterfaceX, InterfaceY {

	@Override
	//Both X and Y interfaces have same signature default methods. That's why,  which one to use should be explicitly defined.
	public void hi() {
		InterfaceX.super.hi(); 		
	}

}
