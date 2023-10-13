package boardedu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import noticeboard.NoticeBean;

public class BoardSetGet {
	List<BoardInfo> list = new ArrayList<BoardInfo>();
	Scanner sc = new Scanner(System.in);

	void setBoard() {
		BoardInfo boardinfo = new BoardInfo();

		System.out.println("===게시물 작성===");

		System.out.println("제목: ");
		boardinfo.setBoardTitle(sc.nextLine());

		System.out.println("\n내용: ");
		boardinfo.setBoardContents(sc.nextLine());

		System.out.println("작성자: ");
		boardinfo.setBoardWriter(sc.nextLine());

		boardinfo.setBoardnumber(list.size() + 1);
		boardinfo.setBoardDate(getDate());
		
		list.add(boardinfo);
	}

	void showBoardList() {
		if (list.size() == 0) {
			System.out.println("======게시물 없음=======");
		}
		for (int i = 0; i < list.size(); i++) {
			BoardInfo boardinfo = list.get(i);

			System.out.println("====현재 등록된 게시물====");
			System.out.println("글 번호:" + boardinfo.getBoardnumber());
			System.out.println("글 제목:" + boardinfo.getBoardTitle());
			System.out.println("====================");
		}
	}

	void getNoticeContents(int getListNumber) {
		for (int i = 0; i < list.size(); i++) {
			BoardInfo boardinfo = list.get(i);

			if (boardinfo.getBoardnumber() == getListNumber) {
				System.out.println("================");

				System.out.println("글 번호:" + boardinfo.getBoardnumber());
				System.out.println("제목: \n" + boardinfo.getBoardTitle());
				System.out.println("내용: \n" + boardinfo.getBoardContents());
				System.out.println("작성자: " + boardinfo.getBoardWriter());
				System.out.println("작성일시: " + boardinfo.getBoardDate());

				System.out.println("================");

			}
		}
	}

	private String getDate() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월dd일 HH시mm분ss초");
		return dateTime.format(formatter);
	}
}