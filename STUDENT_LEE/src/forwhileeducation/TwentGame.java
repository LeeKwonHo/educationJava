package forwhileeducation;

import java.util.Scanner;

public class TwentGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int comNum = (int)(Math.random()*100)+1;
		int userNum;

		
		for( int count = 1; count<=20; count++) {
			System.out.println("1 ~ 100 숫자를 입력해주세요: ");
			userNum = sc.nextInt();

			
			if(userNum == comNum) {
				
				System.out.println("숫자를 맞췃습니다 승리!");
				System.out.println("도전 횟수는: " + count);
				break;
				
			}else if(userNum < comNum) {
				
				System.out.println("문제의 숫자보다 더 적습니다");
				System.out.println("도전 횟수는: " + count);
			
			}else if(userNum > comNum) {
				
				System.out.println("문제의 숫자보다 더 큽니다");
				System.out.println("도전 횟수는: " + count);
		
			}
		}
		sc.close();
	}

}
