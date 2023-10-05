package noticeboard;

import java.util.Scanner;

//사용자에게 보여줄 메뉴클래스
public class NoticeboardMenu {

	Scanner sc = new Scanner(System.in);

	boolean flag = true;

	void noticeStart() {

		while (flag) {

			System.out.println("게시판 메뉴");
			System.out.println("1.글 보기 2.글 작성 3.글 수정 4.글 삭제 5.게시판 종료");
			System.out.println("\n메뉴를 선택하시오: ");
			int userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				ReadNotice readNotice = new ReadNotice();
				readNotice.showList();
				break;

			case 2:
				WriteNotice writenotice = new WriteNotice();
				writenotice.setNotice();
				break;

			case 3:
				// 글 수정 클래스
				break;

			case 4:
				// 글 삭제
				break;

			case 5:
				System.out.println("게시판을 종료합니다.");
				flag = false;
				break;

			default:
				System.out.println("메뉴의 번호를 입력하시오\n");
				break;
			}

		}

	}

}
