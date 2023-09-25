package forwhileeducation;

import java.util.Scanner;

public class BingoTest {

	public static void main(String[] args) {
		BingoGame bingo = new BingoGame();
		Scanner scanner = new Scanner(System.in);
		
		int userNum;
		
		while( true ) {
			
			System.out.println("1~100");
			userNum = scanner.nextInt();
			if(bingo.num == userNum) {
				System.out.println("빙고");
				break;
			}
			bingo.getHint(userNum);
		}
		
		scanner.close();
		
	}

}
