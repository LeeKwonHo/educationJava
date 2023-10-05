package exceptionedu;

public class Test {

	public static void main(String[] args) throws CoffeSoldOutException {

		Guest guest = new Guest(7000);
		Starbucks star = new Starbucks(200);
		star.sellCoffe(guest.guest);

	}

}
