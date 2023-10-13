package boardedu;

import java.util.Scanner;

public class BoardMenu {

	void setMenu() {
		Scanner sc = new Scanner(System.in);
		BoardSetGet board = new BoardSetGet();

		while (true) {

			System.out.println("게시판 메뉴");
			System.out.println("1.글 보기 2.글 작성 3.종료");
			System.out.println("메뉴를 선택하시오: ");
			int userPick = sc.nextInt();

			if (userPick == 1) {
				board.showBoardList();
				if (board.list.size() > 0) {
					System.out.println("게시물 번호 선택:");
					int getListNumber = sc.nextInt();
					board.getNoticeContents(getListNumber);
				}
			}
			if (userPick == 2) {
				board.setBoard();
			}
			if (userPick == 3) {
				System.out.println("게시판 종료");
				break;
			}
		}

	}
}
