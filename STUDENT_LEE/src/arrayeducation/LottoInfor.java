package arrayeducation;

import java.util.Scanner;

public class LottoInfor {

	// 중복 방지 기능 만들기
	int[] lotto = new int[6];
	int[] guest = new int[6];
	int count;

	public LottoInfor() {
		int number = 0;
		for (int i = 0; i < 6; i++) {
			number = (int) (Math.random() * 45) + 1;
			lotto[i] = number;
		}
	}

	void setGusetNum() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " 번째 숫자 입력");
			number = sc.nextInt();
			guest[i] = number;

		}
		sc.close();
	}

	void getBingo() {
		int guestNum = 0;
		int lottoNum = 0;

		for (int i = 0; i < guest.length; i++) {
			guestNum = guest[i];

			for (int j = 0; j < lotto.length; j++) {

				lottoNum = lotto[j];

				if (guestNum == lottoNum) {
					count++;
					break;
				}

			}

		}

	}

}
