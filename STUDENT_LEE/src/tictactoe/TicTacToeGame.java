package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("틱택토");

		// 플레이어 이름 입력
		System.out.print("Player 1의 이름을 알려주세요: ");
		String player1Name = scanner.next();
		
		System.out.print("Player 2의 이름을 알려주세요: ");
		String player2Name = scanner.next();

		Player player1 = new Player(player1Name, "X");
		Player player2 = new Player(player2Name, "O");

		// 게임 보드 초기화
		Board board = new Board();

		// 게임 루프
		while (true) {
			Player currentPlayer = (board.getTurn() == 1) ? player1 : player2;

			board.displayBoard();

			System.out.println(currentPlayer.getName() + ",님의 차례");
			System.out.print("행(0-2)과, 열 (0-2): ");
			
			int row = scanner.nextInt();
			int col = scanner.nextInt();

			if (board.makeMove(row, col, currentPlayer.getSymbol())) {
				
				if (board.checkWin(currentPlayer.getSymbol())) {
					
					board.displayBoard();
					System.out.println(currentPlayer.getName() + " Win!");
					break;
					
				} else if (board.isFull()) {
					
					board.displayBoard();
					System.out.println("Draw!");
					break;
					
				} else {
					
					board.changeTurn();
					
				}
			} else {
				
				System.out.println("");
				
			}
		}

		scanner.close();
	}
}
