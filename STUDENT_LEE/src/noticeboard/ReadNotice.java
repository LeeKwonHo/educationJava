package noticeboard;

import java.util.Scanner;

//게시판 글 보기 클래스
public class ReadNotice {

	Scanner sc = new Scanner(System.in);
	WriteNotice writeNotice = new WriteNotice();
	NoticeBean bean = new NoticeBean();

	void showList() {
		if (writeNotice.list.size() == 0) {
			System.out.println("게시물이 존재하지 않습니다.\n");
		}

		if (writeNotice.list.size() != 0) {
			for (int i = 0; i <= writeNotice.list.size(); i++) {
				bean = (NoticeBean) writeNotice.list.get(i);

				System.out.println("=================================");
				System.out.println("글 번호: " + bean.getNoticeNumber());
				System.out.println("글 제목: " + bean.getNoticeTitle() + "\n");

				System.out.println("보고싶은 게시물의 번호를 선택하시오: \n");
				int userChoice = sc.nextInt();

				if (userChoice == bean.getNoticeNumber()) {
					System.out.println("글 번호: " + bean.getNoticeNumber());
					System.out.println("제목: " + bean.getNoticeTitle());
					System.out.println("내용: " + bean.getNoticeContents());
					System.out.println("작성자: " + bean.getNoticeWriter());
					System.out.println("작성일지: " + bean.getNoticeWritDate());
				} else if (userChoice != bean.getNoticeNumber()) {
					System.out.println("번호가 일치하지 않습니다.");
				}
			}
		}
	}

//	void showNotice() {
//		if (bean.getNoticeNumber() > 0) {
//			System.out.println("보고싶은 게시물의 번호를 선택하시오: \n");
//			int userChoice = sc.nextInt();
//			writeNotice.list.get(userChoice - 1);
//		}
//	}

}// 집에서 글 번호와 제목만 보여주는 메소드 완성하기
