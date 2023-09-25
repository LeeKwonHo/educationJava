package forwhileeducation;

public class BingoGame {

	
	int num;
	
	public BingoGame() {
		num = (int)(Math.random()*100)+1;
	}
	
	void getHint(int userNum) {
		if(num > userNum) {
			System.out.println(userNum + " 보다 큽니다.");
		}else if(num < userNum) {
			System.out.println(userNum + " 보다 작습니다.");
			
		}
	}
	
	
	
}
