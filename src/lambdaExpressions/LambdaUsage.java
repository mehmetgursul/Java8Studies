package lambdaExpressions;

interface IReserve {
	void make();
}

class Reservation {
	public void makeReservation(IReserve reserve) {
		reserve.make();
	}
}

public class LambdaUsage {	
	public static void main(String[] args) {
		Reservation reservation = new Reservation();
		
		// Before the Java 8, we can use Anonymous Function
		reservation.makeReservation(new IReserve() {			
			@Override
			public void make() {
				System.out.println("Dinner reservation has just completed without using Lambda Expression");				
			}
		});
		
		// With Java 8, we can use Lambda Function
		reservation.makeReservation(() -> System.out.println("Dinner reservation has just completed by using Lambda Expression"));
	}
}
