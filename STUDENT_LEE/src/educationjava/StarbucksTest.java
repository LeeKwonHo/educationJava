package educationjava;

import java.util.Scanner;

public class StarbucksTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트에서는 스타벅스의 커피 가격을 받고 게스트가 주문을 하면 
		//돈을 받고 커피를 주는데 스타벅스와 손님이 가진돈을 표현
		
		//메뉴출력, 가격표시
		//손님이 가진돈 표시, 구매하면 가격만큼 돈 차감
		//스타벅스는 돈을 받은만큼 더해짐
		//총액, 손님의 돈, 스벅이 가진 돈을 출력
		
		//스타벅스에 커피 메뉴와 가격을 생성
		Starbucks sb = new Starbucks(1000000);
		Guest guest = new Guest(1000000);
		
		//스타벅스의 메뉴 만들기
		System.out.println("메뉴를 입력 해주세요: ");
		String menu = sc.nextLine();
		sb.getMenu(menu);
		
		//만든 메뉴의 가격 만들기
		System.out.println("메뉴의 가격을 알려주세요: ");
		int price = sc.nextInt();
		sb.getPrice(price);
		
		//손님이 가진돈과 구매시 차감메소드 만들기
		System.out.println("손님의 잔액: " + guest.monney);
		
		//메뉴 구매갯수 만들기
		System.out.println(sb.menu + "의 구매 갯수를 입력하세요: ");
		int count = sc.nextInt();
		guest.getCount(count);
		
		//손님 결제 금액과, 메뉴의 갯수,가격 , 스타벅스가 가진 돈 출력
		int totalprice = sb.price * guest.count;
		
		//메뉴의 가격과 갯수를 알려주고 결제금액 알려주기
		System.out.println(sb.menu + "의 가격은: " + sb.price + "원");
		System.out.println(sb.menu + "의 구매갯수: " + guest.count);
		System.out.println("결제하실 금액: " + totalprice + "원");
		
		//손님의 잔액 만들기
		int guestMonney = guest.monney - totalprice;
		System.out.println("손님의 잔액: " + guestMonney + "원");
		
		//스타벅스의 잔액 만들기
		int sbMonney = sb.monney + totalprice;
		System.out.println("스타벅스의 총액: " + sbMonney + "원");
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
