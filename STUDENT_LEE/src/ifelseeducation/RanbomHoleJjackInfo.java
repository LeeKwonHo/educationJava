package ifelseeducation;

import java.util.Scanner;

public class RanbomHoleJjackInfo {
	Scanner sc = new Scanner(System.in);
	
	int comNum;
	int userChoice;
	
	//홀짝 생성
	public RanbomHoleJjackInfo() {
		comNum = (int)(Math.random()*9);
	}
	
	//사용자가 결과 선택
	void getUserChoice() {
		String choice = "";
		
		System.out.println("홀: 1, 짝: 2");
		userChoice = sc.nextInt();
		
		if(userChoice == 1) {
			choice = "홀";
		}else {
			choice = "짝";
		}
		System.out.println("당신의 선택:" + choice);
	}
		
	//랜덤 숫자의 홀짝을 처리
	void getResult() {
		String result = "";
		
		if((comNum % 2) == 0) {
			result = "짝";
		}else if((comNum % 2) != 0) {
			result = "홀";
		}
		//숫자와 결과 출력
		System.out.println("이번 숫자는: " + comNum);
		System.out.println("결과는: " + result);
		
		//승패 출력
		if((userChoice == 2) && (result == "짝")) {
			System.out.println("승리");
		}else if((userChoice == 1) && (result == "홀")) {
			System.out.println("승리");
		}else {
			System.out.println("패배");
		}
	}
	
}
