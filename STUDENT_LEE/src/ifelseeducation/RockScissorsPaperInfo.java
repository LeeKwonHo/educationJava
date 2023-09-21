package ifelseeducation;

import java.util.Scanner;

/* 0 메타 데이터 정하기
 * 1 생성자에서 랜덤 번호 지정
 * 2 메소드로 사용자가 입력하는 번호를 받기
 * 3 컴퓨터와 사용자의 선택 표시
 * 4 결과판독 메소드
 */
public class RockScissorsPaperInfo {

	int comNumber;
	int userNumber;

	// 생성될때 랜덤번호 생성
	public RockScissorsPaperInfo() {
		comNumber = (int) (Math.random() * 3) + 1;
	}

	// 사용자의 번호 받기
	void setUserNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1:가위,2:바위,3:보");
		userNumber = sc.nextInt();
		
		sc.close();
	}

	// 컴퓨터의 숫자를 스트링으로 바꾸기
	void printNumber() {
		
		String comNumkor = "";
		String userNumkor = "";

		if (1 == comNumber) {
			comNumkor = "가위";
		} else if (2 == comNumber) {
			comNumkor = "바위";
		} else if (3 == comNumber) {
			comNumkor = "보";
		} else {
			// 처리없음
		}
		
		// 유저 번호를 문자로 바꾸기
		
		if (1 == userNumber) {
			userNumkor = "가위";
		} else if (2 == userNumber) {
			userNumkor = "바위";
		} else if (3 == userNumber) {
			userNumkor = "보";
		} else {
			// 처리없음
		}
		System.out.println("컴: " + comNumkor);
		System.out.println("도전자: " + userNumkor);
	}

	// 결과 프린트
	void resultGame() {
		String result = "";
		int minus = (userNumber - comNumber);

		if (userNumber == comNumber) {
			result = "비김";
		} else if ((1 == minus) || (-2 == minus)) {
			result = "승리";
		} else {
			result = "패배";
		}
		System.out.println("결과는: " + result);
	}
	
}
