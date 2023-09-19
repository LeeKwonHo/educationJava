package educationjava;

public class ShopInfor {

	int price;
	int order;
	int totalPrice;
	
	public ShopInfor() {
	}

	public int getCount(int price) {
		return this.price = price;
	}
	
	public int getOrder(int order) {
		return this.order = order;
	}

	public void getTotalPrice() {
		totalPrice = price * order;
	}
}
