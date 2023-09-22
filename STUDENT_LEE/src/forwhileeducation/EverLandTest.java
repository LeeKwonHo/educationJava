package forwhileeducation;



public class EverLandTest {

	public static void main(String[] args) {
		
		int total = 0;
		
		
		for(int i = 1; i < 1001; i++) {
			if(i % 4 == 0) {
				Everland et1 = new Everland(i, 35000, "청소년");
				System.out.println("티켓번호: " + et1.ticketNo
						+ "\n손님의 정보: " + et1.ticketType
						+ "\n티켓 가격: " + et1.ticketPrice
						+ "\n총 매출액: " + total);
				total += et1.ticketPrice;
			}else if(i % 7 == 0) {
				Everland et2 = new Everland(i, 18000, "유아");
				
				System.out.println("티켓번호: " + et2.ticketNo
						+ "\n손님의 정보: " + et2.ticketType
						+ "\n티켓 가격: " + et2.ticketPrice
						+ "\n총 매출액: " + total);
				total += et2.ticketPrice;
			}else if((i % 7) == (i % 4)) {
				Everland et3 = new Everland(i, 0, "빅 이벤트 공짜");
				
				System.out.println("티켓번호: " + et3.ticketNo
						+ "\n손님의 정보: " + et3.ticketType
						+ "\n티켓 가격: " + et3.ticketPrice
						+ "\n총 매출액: " + total);
				total += et3.ticketPrice;
			}else {
				Everland et = new Everland(i,50000,"성인");
				
				System.out.println("티켓번호: " + et.ticketNo
						+ "\n손님의 정보: " + et.ticketType
						+ "\n티켓 가격: " + et.ticketPrice
						+ "\n총 매출액: " + total);
				total += et.ticketPrice;
			}
			
			
			
			

		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
