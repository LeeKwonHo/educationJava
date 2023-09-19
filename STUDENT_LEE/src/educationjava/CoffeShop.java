package educationjava;

import java.util.Scanner;

public class CoffeShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("커피 가격: ");
//		int coffePrice = sc.nextInt();
//
//		
//		System.out.println("총 수량: ");
//		int totalOder = sc.nextInt();
//
//		int totalprice = coffePrice * totalOder;
//		System.out.println("총액은"+ totalprice + "입니다");
//	
		System.out.println("커피의 가격: ");
		int price = sc.nextInt();
		
		CoffePrice cp = new CoffePrice(price);
		
		System.out.println("수량: ");
		int order = sc.nextInt();
		
		int total = cp.TotalPrice(order);
		System.out.println("총" + total + "원");
		
		sc.close();
	}
	

}
