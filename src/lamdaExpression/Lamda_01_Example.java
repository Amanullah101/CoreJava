package lamdaExpression;

public class Lamda_01_Example {

	public static void main(String[] arg) {
		Cab cab = () -> System.out.println("You cab is booked");
		cab.book();
	}
}

interface Cab{
	void  book();
}