package variableexample;

import java.util.Scanner;

public class ScannerEducation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double americano = 4000;
		
		System.out.println("아메리카노 한잔 가격은 " + americano + "입니다.");
		System.out.println("주문 수량을 입력해 주세요: ");
		int order = sc.nextInt();
		
		double price = order * americano;
		
		System.out.println("총 주문 수량: " + order);
		System.out.println("총 금액: " + price);
		
		sc.close();
	}

}