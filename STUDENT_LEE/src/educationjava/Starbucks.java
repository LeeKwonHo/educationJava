package educationjava;

public class Starbucks {

	int monney;
	int price;
	String menu;

	public Starbucks() {
	}

	public Starbucks(int monney) {
		this.monney = monney;
	}

	String getMenu(String menu) {
		return this.menu = menu;
	}
	
	int getPrice(int price) {
		return this.price = price;
	}
	
}
