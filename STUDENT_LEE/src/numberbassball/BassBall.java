package numberbassball;

import java.util.Scanner;

public class BassBall {
	private int[] computerNumber;

	public BassBall() {
		// 생성자에서 컴퓨터가 3자리 숫자를 생성하도록 초기화
		computerNumber = generateRandomNumber();
	}

	// 컴퓨터가 무작위로 3자리 숫자 생성
	public int[] generateRandomNumber() {
		int[] number = new int[3];
		boolean[] used = new boolean[10]; // 0부터 9까지의 숫자 사용 여부를 표시

		for (int i = 0; i < 3; i++) {
			int digit;
			do {
				digit = (int) (Math.random() * 10) + 1; // 0 이상 9 이하의 랜덤 정수 얻음
			} while (used[digit]); // 이미 사용된 숫자면 다시 생성

			number[i] = digit;
			used[digit] = true; // 숫자 사용 표시
		}

		return number;
	}

	// 스트라이크와 볼 계산
	public int[] calculateResult(int[] guess) {
		int strikes = 0;
		int balls = 0;
		for (int i = 0; i < 3; i++) {
			if (computerNumber[i] == guess[i]) {
				strikes++;
			} else if (contains(computerNumber, guess[i])) {
				balls++;
			}
		}
		return new int[] { strikes, balls };
	}

	// 배열에서 특정 숫자 포함 여부 확인
	private boolean contains(int[] arr, int target) {
		for (int num : arr) {
			if (num == target) {
				return true;
			}
		}
		return false;
	}

	public int[] getPlayerGuess() {
		Scanner scanner = new Scanner(System.in);
		int[] guess = new int[3];
		System.out.print("3자리 숫자를 입력하세요: ");

		for (int i = 0; i < 3; i++) {
			int usernum;
			boolean isDuplicate;

			do {
				usernum = scanner.nextInt();
				isDuplicate = false; // 각 루프마다 isDuplicate를 false로 초기화

				if (usernum < 1 || usernum > 10) {
					System.out.println("1~10의 숫자중 하나를 선택하세요.");
					isDuplicate = true; // 범위를 벗어난 경우는 중복 처리하지 않도록
				} else {
					for (int j = 0; j < i; j++) {
						if (guess[j] == usernum) {
							System.out.println("이미 입력한 숫자입니다. 다른 숫자를 선택하세요.");
							isDuplicate = true;
							break;
						}
					}
				}
			} while (isDuplicate);

			guess[i] = usernum;
		}

		return guess;
	}
}
