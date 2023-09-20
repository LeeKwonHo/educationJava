package educationjava;

import java.util.Scanner;

public class ShopEducation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShopInfor shopInfor = new ShopInfor();
		int price;
		int order;
		
		System.out.println("빵의 가격을 입력하세요: ");
		price = sc.nextInt();
		
		shopInfor.getPrice(price);
		
		System.out.println("빵의 갯수를 입력하세요: ");
		order = sc.nextInt();
		
		shopInfor.getOrder(order);
		
		shopInfor.getTotalPrice();
		
		System.out.println("빵의 가격: " + shopInfor.price + "원 입니다.");
		System.out.println("빵의 갯수: " + shopInfor.order + "개 입니다.");
		System.out.println("총 금액: " + shopInfor.totalPrice + "원 입니다.");
	
		
		sc.close();
	}

}
