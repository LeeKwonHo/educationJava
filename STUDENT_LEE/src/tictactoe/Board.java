package tictactoe;

import java.text.DateFormatSymbols;

public class Board {
	private char[][] board;
	private int turn;

	public Board() {
		board = new char[3][3];
		initializeBoard();
		turn = 1; // Player 1 starts
	}

	public void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public void displayBoard() {
		System.out.println("열:  0 1 2"); // 열 번호 출력
		System.out.println("행");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " "); // 행 번호 출력
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("-----------");
			}
		}

	}

	public boolean makeMove(int row, int col, String symbol) {
		// 1. 주어진 위치가 유효한지 확인
		if (isValidMove(row, col)) {
			// 2. 해당 위치가 이미 다른 기호로 채워져 있는지 확인
			if (board[row][col] == ' ') {
				// 3. 유효한 움직임을 처리
				board[row][col] = symbol.charAt(0);
				return true; // 유효한 움직임인 경우 true 반환
			} else {
				// 이미 다른 기호로 채워진 경우
				System.out.println("이 위치는 이미 사용 중입니다. 다른 위치를 선택하세요.");
				return false; // 유효하지 않은 움직임인 경우 false 반환
			}
		} else {
			// 유효한 위치가 아닌 경우
			System.out.println("유효하지 않은 위치입니다. 다른 위치를 선택하세요.");
			return false; // 유효하지 않은 움직임인 경우 false 반환
		}
	}

	public boolean checkWin(String symbol) {
		// 가로, 세로, 대각선 방향으로 승리 조건을 확인
		for (int i = 0; i < 3; i++) {
			// 가로 방향 확인
			if (board[i][0] == symbol.charAt(0) && board[i][1] == symbol.charAt(0) && board[i][2] == symbol.charAt(0)) {
				return true;
			}
			// 세로 방향 확인
			if (board[0][i] == symbol.charAt(0) && board[1][i] == symbol.charAt(0) && board[2][i] == symbol.charAt(0)) {
				return true;
			}
		}

		// 대각선 방향 확인 (왼쪽 위에서 오른쪽 아래 방향)
		if (board[0][0] == symbol.charAt(0) && board[1][1] == symbol.charAt(0) && board[2][2] == symbol.charAt(0)) {
			return true;
		}

		// 대각선 방향 확인 (오른쪽 위에서 왼쪽 아래 방향)
		if (board[0][2] == symbol.charAt(0) && board[1][1] == symbol.charAt(0) && board[2][0] == symbol.charAt(0)) {
			return true;
		}

		// 어떤 승리 조건도 만족하지 않는 경우
		return false;
	}

	public boolean isFull() {
		for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (board[i][j] != 'X' && board[i][j] != 'O') {
	                // 만약 비어있는 셀을 찾으면, 보드가 아직 가득 차지 않았음을 의미하고 false를 반환
	                return false;
	            }
	        }
	    }
	    // 모든 셀이 'X' 또는 'O'로 채워져 있다면 보드가 가득 찼음을 의미하고 true를 반환
	    return true;
	}

	public void changeTurn() {
		turn = (turn == 1) ? 2 : 1;
	}

	public int getTurn() {
		return turn;
	}

	private boolean isValidMove(int row, int col) {
		return row >= 0 && row < 3 && col >= 0 && col < 3;
	}
}
