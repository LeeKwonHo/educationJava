package educationjava;

public class CoffePrice {

	int coffePrice;
	
	
	public CoffePrice(int coffePrice) {
		this.coffePrice = coffePrice;
	}
	
	public int TotalPrice(int order) {
		return
				coffePrice * order;
	}
}
