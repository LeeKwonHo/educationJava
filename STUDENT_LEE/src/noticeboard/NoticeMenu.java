package noticeboard;

import java.util.Scanner;

public class NoticeMenu {

	void showMenu() {
		Scanner sc = new Scanner(System.in);
		WriteNotice writenotice = new WriteNotice();

		boolean flag = true;

		while (flag) {
			System.out.println("1. 게시글 보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 게시판 종료");
			int userPick = sc.nextInt();

			if (userPick == 1) {
				writenotice.getNoticeList();

				if (writenotice.getSize() > 0) {
					System.out.println("게시글의 번호를 선택해주세요.");
					int getListNumber = sc.nextInt();
					writenotice.getNoticeContents(getListNumber);
				}
			}
			if (userPick == 2) {
				writenotice.setNotice();
			}
			if (userPick == 3) {
				writenotice.getNoticeList();
				System.out.println("수정할 게시글을 선택해주세요 : ");
				int resetNoticeNumber = sc.nextInt();
				writenotice.resetNotice(resetNoticeNumber);
			}
			if (userPick == 4) {
				writenotice.getNoticeList();
				System.out.println("삭제할 게시글의 번호를 입력하시오: ");
				int removeNumber = sc.nextInt();
				writenotice.removeNotice(removeNumber);
			}
			if (userPick == 5) {
				System.out.println("게시판을 종료합니다.");
				flag = false;
			}

		}
	}

}
